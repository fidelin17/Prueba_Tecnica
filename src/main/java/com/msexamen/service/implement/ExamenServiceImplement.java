package com.msexamen.service.implement;

import com.msexamen.entity.Calificacion;
import com.msexamen.entity.Examen;
import com.msexamen.entity.RespuestasEstudiante;
import com.msexamen.repository.CalificacionRepository;
import com.msexamen.repository.ExamenRepository;
import com.msexamen.repository.RespuestasEstudianteRepository;
import com.msexamen.repository.RespuestasRepository;
import com.msexamen.request.PreguntaRespuestaRequest;
import com.msexamen.request.RespuestasRequest;
import com.msexamen.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamenServiceImplement implements ExamenService {
    @Autowired
    private ExamenRepository repository;

    @Autowired
    private RespuestasRepository respuestaRepo;

    @Autowired
    private CalificacionRepository calRepo;

    @Autowired
    private RespuestasEstudianteRepository rseRepo;

    @Override
    public Object newExamen(Examen examen) throws Exception {
        Object newexamen = repository.save(examen);
        return newexamen;
    }

    @Override
    public List<Examen> getAllExamens() throws Exception {
        List<Examen> list = repository.findAll();
        return list;
    }

    public Calificacion calificar(RespuestasRequest request) throws  Exception {
        //Contador correctas
        int correctas = 0;

        //Iterar sobre la lista de reactivos contestados provenientes del request
        for (PreguntaRespuestaRequest rr : request.getList()) {
            //Objeto que al final se va persistir
            RespuestasEstudiante resEstudiante = new RespuestasEstudiante();

            resEstudiante.setIdestudiante(request.getIdestudiante());
            resEstudiante.setIdexamen(request.getIdexamen());
            resEstudiante.setIdpregunta(rr.getIdpregunta());
            resEstudiante.setRespuesta(rr.getRespuesta());
            //Persiste el registro en RespuestasEstudiante
            rseRepo.save(resEstudiante);
            //Filtro que compara la respuesta correcta almacenada de la pregunta en la db, contra la respuesta que el alumn indico
            //incrementa contador solo si ambas respuestas coinciden
            if (respuestaRepo.getRespuestaByPreguntaId(rr.getIdpregunta()) == Integer.parseInt(rr.getRespuesta())) {
                correctas++;
            }
        }

        //Crea y guarda el objeto que contiene la calficacion del alumno en un determinado examen
        Calificacion cal = new Calificacion();
        cal.setIdestudiante(request.getIdestudiante());
        cal.setIdexamen(request.getIdexamen());
        cal.setPromedio(Integer.toString(correctas * 20));
        calRepo.save(cal);
        return cal;
    }
}
