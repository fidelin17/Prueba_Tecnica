PGDMP     -    0                z           examen    14.2    14.2 %    )           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            *           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            +           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ,           1262    25125    examen    DATABASE     c   CREATE DATABASE examen WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Mexico.1252';
    DROP DATABASE examen;
                postgres    false            ?            1259    25332    calificacion    TABLE     ?   CREATE TABLE public.calificacion (
    idcalificacion uuid NOT NULL,
    idestudiante uuid,
    idexamen uuid,
    promedio character varying(255)
);
     DROP TABLE public.calificacion;
       public         heap    postgres    false            ?            1259    25337    ciudad    TABLE     ?   CREATE TABLE public.ciudad (
    idciudad uuid NOT NULL,
    nombre character varying(255),
    zonahoraria character varying(255)
);
    DROP TABLE public.ciudad;
       public         heap    postgres    false            ?            1259    25473 
   estudiante    TABLE     ?   CREATE TABLE public.estudiante (
    idestudiante uuid NOT NULL,
    edad integer NOT NULL,
    idciudad uuid,
    nombre character varying(255)
);
    DROP TABLE public.estudiante;
       public         heap    postgres    false            ?            1259    25351    examen    TABLE     ^   CREATE TABLE public.examen (
    idexamen uuid NOT NULL,
    nombre character varying(255)
);
    DROP TABLE public.examen;
       public         heap    postgres    false            ?            1259    25498    fechaexamen    TABLE     ?   CREATE TABLE public.fechaexamen (
    idfechaexamen uuid NOT NULL,
    fecha timestamp without time zone,
    idciudad uuid,
    idexamen uuid
);
    DROP TABLE public.fechaexamen;
       public         heap    postgres    false            ?            1259    25361    fechaexamenzona    TABLE     ?   CREATE TABLE public.fechaexamenzona (
    ide_fecha_examen_zona uuid NOT NULL,
    idestudiante uuid,
    idfechaexamen uuid
);
 #   DROP TABLE public.fechaexamenzona;
       public         heap    postgres    false            ?            1259    25133    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public          postgres    false            ?            1259    25366 	   preguntas    TABLE     x   CREATE TABLE public.preguntas (
    idpregunta uuid NOT NULL,
    idexamen uuid,
    pregunta character varying(255)
);
    DROP TABLE public.preguntas;
       public         heap    postgres    false            ?            1259    25371 
   respuestas    TABLE       CREATE TABLE public.respuestas (
    idrespuesta uuid NOT NULL,
    correcta character varying(255),
    idpregunta uuid,
    opcion1 character varying(255),
    opcion2 character varying(255),
    opcion3 character varying(255),
    opcion4 character varying(255)
);
    DROP TABLE public.respuestas;
       public         heap    postgres    false            ?            1259    25503    respuestas_estudiante    TABLE     ?   CREATE TABLE public.respuestas_estudiante (
    id_respuesta_estudiante uuid NOT NULL,
    idestudiante uuid,
    idexamen uuid,
    idpregunta uuid,
    respuesta character varying(255)
);
 )   DROP TABLE public.respuestas_estudiante;
       public         heap    postgres    false                      0    25332    calificacion 
   TABLE DATA           X   COPY public.calificacion (idcalificacion, idestudiante, idexamen, promedio) FROM stdin;
    public          postgres    false    210   ?*                 0    25337    ciudad 
   TABLE DATA           ?   COPY public.ciudad (idciudad, nombre, zonahoraria) FROM stdin;
    public          postgres    false    211   ?+       $          0    25473 
   estudiante 
   TABLE DATA           J   COPY public.estudiante (idestudiante, edad, idciudad, nombre) FROM stdin;
    public          postgres    false    216   -,                  0    25351    examen 
   TABLE DATA           2   COPY public.examen (idexamen, nombre) FROM stdin;
    public          postgres    false    212   ?,       %          0    25498    fechaexamen 
   TABLE DATA           O   COPY public.fechaexamen (idfechaexamen, fecha, idciudad, idexamen) FROM stdin;
    public          postgres    false    217   ?-       !          0    25361    fechaexamenzona 
   TABLE DATA           ]   COPY public.fechaexamenzona (ide_fecha_examen_zona, idestudiante, idfechaexamen) FROM stdin;
    public          postgres    false    213   5.       "          0    25366 	   preguntas 
   TABLE DATA           C   COPY public.preguntas (idpregunta, idexamen, pregunta) FROM stdin;
    public          postgres    false    214   R.       #          0    25371 
   respuestas 
   TABLE DATA           k   COPY public.respuestas (idrespuesta, correcta, idpregunta, opcion1, opcion2, opcion3, opcion4) FROM stdin;
    public          postgres    false    215   ?/       &          0    25503    respuestas_estudiante 
   TABLE DATA           w   COPY public.respuestas_estudiante (id_respuesta_estudiante, idestudiante, idexamen, idpregunta, respuesta) FROM stdin;
    public          postgres    false    218   91       -           0    0    hibernate_sequence    SEQUENCE SET     @   SELECT pg_catalog.setval('public.hibernate_sequence', 4, true);
          public          postgres    false    209            }           2606    25336    calificacion calificacion_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.calificacion
    ADD CONSTRAINT calificacion_pkey PRIMARY KEY (idcalificacion);
 H   ALTER TABLE ONLY public.calificacion DROP CONSTRAINT calificacion_pkey;
       public            postgres    false    210                       2606    25343    ciudad ciudad_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.ciudad
    ADD CONSTRAINT ciudad_pkey PRIMARY KEY (idciudad);
 <   ALTER TABLE ONLY public.ciudad DROP CONSTRAINT ciudad_pkey;
       public            postgres    false    211            ?           2606    25477    estudiante estudiante_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.estudiante
    ADD CONSTRAINT estudiante_pkey PRIMARY KEY (idestudiante);
 D   ALTER TABLE ONLY public.estudiante DROP CONSTRAINT estudiante_pkey;
       public            postgres    false    216            ?           2606    25355    examen examen_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.examen
    ADD CONSTRAINT examen_pkey PRIMARY KEY (idexamen);
 <   ALTER TABLE ONLY public.examen DROP CONSTRAINT examen_pkey;
       public            postgres    false    212            ?           2606    25502    fechaexamen fechaexamen_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.fechaexamen
    ADD CONSTRAINT fechaexamen_pkey PRIMARY KEY (idfechaexamen);
 F   ALTER TABLE ONLY public.fechaexamen DROP CONSTRAINT fechaexamen_pkey;
       public            postgres    false    217            ?           2606    25365 $   fechaexamenzona fechaexamenzona_pkey 
   CONSTRAINT     u   ALTER TABLE ONLY public.fechaexamenzona
    ADD CONSTRAINT fechaexamenzona_pkey PRIMARY KEY (ide_fecha_examen_zona);
 N   ALTER TABLE ONLY public.fechaexamenzona DROP CONSTRAINT fechaexamenzona_pkey;
       public            postgres    false    213            ?           2606    25370    preguntas preguntas_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.preguntas
    ADD CONSTRAINT preguntas_pkey PRIMARY KEY (idpregunta);
 B   ALTER TABLE ONLY public.preguntas DROP CONSTRAINT preguntas_pkey;
       public            postgres    false    214            ?           2606    25507 0   respuestas_estudiante respuestas_estudiante_pkey 
   CONSTRAINT     ?   ALTER TABLE ONLY public.respuestas_estudiante
    ADD CONSTRAINT respuestas_estudiante_pkey PRIMARY KEY (id_respuesta_estudiante);
 Z   ALTER TABLE ONLY public.respuestas_estudiante DROP CONSTRAINT respuestas_estudiante_pkey;
       public            postgres    false    218            ?           2606    25377    respuestas respuestas_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT respuestas_pkey PRIMARY KEY (idrespuesta);
 D   ALTER TABLE ONLY public.respuestas DROP CONSTRAINT respuestas_pkey;
       public            postgres    false    215            ?           2606    25478 &   estudiante fk73xrewnqyja3mjpva141u2v86    FK CONSTRAINT     ?   ALTER TABLE ONLY public.estudiante
    ADD CONSTRAINT fk73xrewnqyja3mjpva141u2v86 FOREIGN KEY (idciudad) REFERENCES public.ciudad(idciudad);
 P   ALTER TABLE ONLY public.estudiante DROP CONSTRAINT fk73xrewnqyja3mjpva141u2v86;
       public          postgres    false    211    216    3199            ?           2606    25388 &   respuestas fkgaet1gr386n9ojbtirhq7jgsk    FK CONSTRAINT     ?   ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT fkgaet1gr386n9ojbtirhq7jgsk FOREIGN KEY (idpregunta) REFERENCES public.preguntas(idpregunta);
 P   ALTER TABLE ONLY public.respuestas DROP CONSTRAINT fkgaet1gr386n9ojbtirhq7jgsk;
       public          postgres    false    215    214    3205            ?           2606    25508 '   fechaexamen fktag65f42ixlag8kage7bqrgs3    FK CONSTRAINT     ?   ALTER TABLE ONLY public.fechaexamen
    ADD CONSTRAINT fktag65f42ixlag8kage7bqrgs3 FOREIGN KEY (idciudad) REFERENCES public.ciudad(idciudad);
 Q   ALTER TABLE ONLY public.fechaexamen DROP CONSTRAINT fktag65f42ixlag8kage7bqrgs3;
       public          postgres    false    211    217    3199            ?           2606    25383 %   preguntas fktqcswmee5j0l8cc7vq3te7cma    FK CONSTRAINT     ?   ALTER TABLE ONLY public.preguntas
    ADD CONSTRAINT fktqcswmee5j0l8cc7vq3te7cma FOREIGN KEY (idexamen) REFERENCES public.examen(idexamen);
 O   ALTER TABLE ONLY public.preguntas DROP CONSTRAINT fktqcswmee5j0l8cc7vq3te7cma;
       public          postgres    false    212    3201    214               ?   x????m 1??L/DؘŽ??b?/!Ns@??a?p(7,??(4?3Q?D7???8?$?r??dY?~?4?c??l0??=??0-?b?W=??z?].?ƂՄ`???ړm??!i?v??l???Y??A??݈ƻ>_??+0?F???(??n'?}????V?Y?9???.??f?,?????X:????Zq?GN?ޖSќ?[??/d5?":??l??!?[???}??-<??         ~   x?M?+1 Pݞ??I?Iڞ ?I??G???̠??U????)LA`.m???????????
?ŕ?:C????l,%gjҘ???eI??&*?"?!?[\Z1????^??????|;朿??(?      $   ?   x???A?C1 ???],j?o1?Fc????1?0????;??V!??	C?`M??Rsփ??i"?\?r?D??FSh?9?؏Z?ǫ???MN???)dW?N?j?d?:?Y??n$J>x???h0?????BeF9????绍??0ů????ї??)yk??M@?2? =?qϲ??????[VU(          ?   x??1?0 ????Q?ر3? $??:vU??T????sLLs? ???M,d)?cL=}?s3?%?5?@??
s@'(?g?\??M?????m?Oj??G?^?Gi??AT|?a???՗C???R?u?)2      %   ?   x????mE1????
d????KY??! E Vq<???)J????U?G?Κ\Ώ?1H쫭??#?s?6Ҙ??I{y
W?~LG?(:?,?U??%{o'G?ި?uh??˹?;??:f4W?*?0??-s2a??Y??'0??~????&@      !      x?????? ? ?      "   L  x???;?1??)?4?c???v??)c ?ۘ????c?v%??z?@???B皡T ?
ih?DZoJR?"A?JP?7?S!?zd?}?xy}z]????????ݥ???m?C?4.???9o\???a?~/?/]!?D?j?P??}b??I?Ҝy?OG??Z'????~???àK?^????=N?ǝ}pU?@N#A?M?E?0,?P̳??q???H??ǝ?H?1????56"??ۜm??u?:??V?S?L?O?L??ϻ??]O????u8J<??y?i[???X%???MuN5 ?J?=??[@
?b???????m+l~_???????溶?      #   {  x?]?Mn$!???)?na???e66?RE?t+????(?ȂO???n3`?<?&???1?M?4J??I????`?+P??m??\????	[??0?T??W?!-[@E?tAU.?޼?%J?G??sˆh?=?hS?S?'???Z??X@[m??4?2
???H??,???e?Ԕ?sq?Q#???]???mɼ??
B? -?????53??l??$m??`?+K?????y?i?oH?q?@t???o?c?և?4?Ds?YZwa4?V?A?YV??P??}?<jp??J?;???P0Ɔ͹.??%?N????u[??4?PB????????>u^???ϻ?????sꛦ?x]?ǹ?\?z???u?^ן???v?_e??      &   #  x????$ ߻?p?????????j?f\A??RHw?hP???}?b{Z??V#r `=r???/??B????????ҁ?`??z?Zc?g~T4̳ \f?TN?5x??+??%???1?.?????C?Ʌ??,??ա??v??K ?&\??t?N?y???J???o?w l????Bu~hE????"??t g>Ţ???s??Y*?k??jq?I??ڄ???C+_?U??g?'?	?3??_?Ǝw???na?@????5?F?u????U:?O?=!1?m?@???O?	?????????)??P     