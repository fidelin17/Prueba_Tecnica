package com.msexamen.controller;

import com.msexamen.entity.*;
import com.msexamen.request.RespuestasRequest;
import com.msexamen.service.*;
import com.msexamen.service.implement.ExamenServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/examen")
public class ExamenController {
    @Autowired
    private EstudianteService service;

    @Autowired
    private ExamenServiceImplement examenService;

    @Autowired
    private FechaExamenService fechaExamenService;

    @Autowired
    private RespuestasService respuestasService;

    @Autowired
    private CiudadService ciudadService;

    @Autowired
    private PreguntasService preguntasService;

    @Autowired
    private CalificacionService calificacionService;

    @Autowired
    private RespuestasEstudianteService respuestasEstudianteService;

    @PostMapping("/guardar/estudiante")
    public ResponseEntity<?> saveEstudiante(@RequestBody Estudiante estudiante) throws Exception {
        Object newEstudent= service.newEstudiante(estudiante);
        return new ResponseEntity<>(newEstudent, HttpStatus.CREATED) ;
    }
    @PostMapping("/guardar/examen")
    public ResponseEntity<?> saveExamen(@RequestBody Examen examen) throws Exception {
        Object newExamen= examenService.newExamen(examen);
        return new ResponseEntity<>(newExamen, HttpStatus.CREATED) ;
    }
    @GetMapping("/obtener/examen") //obtener examen
    public ResponseEntity<List<?>> getAllExamens() throws Exception {
        return new ResponseEntity<>(examenService.getAllExamens(),HttpStatus.OK);
    }
    @PostMapping("/guardar/examen/calificar")//responder examen guardar respuestas del estudiante y califica
    public ResponseEntity<?> saveRespuestasYCalificacion(@RequestBody RespuestasRequest respuestasRequest) throws Exception {
        Object newCalifi= examenService.calificar(respuestasRequest);
        return new ResponseEntity<>(newCalifi, HttpStatus.CREATED) ;
    }

    @PostMapping("/guardar/fecha") //fecha examen
    public ResponseEntity<?> saveFechaExamen(@RequestBody FechaExamen fechaExamen) throws Exception {
        Object newFechaExamen= fechaExamenService.newFechaExamen(fechaExamen);
        return new ResponseEntity<>(newFechaExamen, HttpStatus.CREATED) ;
    }
    @PostMapping("/guardar/pregunta") //guardar pregunta
    public ResponseEntity<?> savePregunta(@RequestBody Preguntas preguntas) throws Exception {
        Object newPregunta= preguntasService.newPregunta(preguntas);
        return new ResponseEntity<>(newPregunta, HttpStatus.CREATED) ;
    }
    @GetMapping("/obtener/preguntas") //lista de preguntas
    public ResponseEntity<List<?>> getAllPreguntas() throws Exception {
        return new ResponseEntity<>(preguntasService.getAllPreguntas(), HttpStatus.OK);
    }

    @PostMapping("/guardar/respuestas") //guardar respuestas
    public ResponseEntity<?> guardarRespuestasExamen(@RequestBody Respuestas respuestas) throws Exception {
        Object newRespuestasExamen= respuestasService.newRespuestas(respuestas);
        return new ResponseEntity<>(newRespuestasExamen, HttpStatus.CREATED) ;
    }
    @PostMapping("/guardar/ciudad") //guardar ciudad
    public ResponseEntity<?> guardarZonaHoraria(@RequestBody Ciudad ciudad) throws Exception {
        Object newCiuda= ciudadService.newZonaHoraria(ciudad);
        return new ResponseEntity<>(newCiuda, HttpStatus.CREATED) ;
    }


    @GetMapping("/obtener/respuestas/{idestudiante}/{idexamen}")
    public ResponseEntity<List<?>> obtenerRespuestasEstudiante (@PathVariable("idestudiante")UUID idestudiante, @PathVariable("idexamen") UUID idexamen) throws Exception {
        List<RespuestasEstudiante> list =respuestasEstudianteService.obtenerRespuestas(idestudiante,idexamen);
        return new ResponseEntity<>(list, HttpStatus.OK) ;
    }
}
