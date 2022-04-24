PGDMP                         z           examen    14.2    14.2 #    '           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            (           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            )           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            *           1262    25125    examen    DATABASE     c   CREATE DATABASE examen WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Mexico.1252';
    DROP DATABASE examen;
                postgres    false            �            1259    25332    calificacion    TABLE     �   CREATE TABLE public.calificacion (
    idcalificacion uuid NOT NULL,
    idestudiante uuid,
    idexamen uuid,
    promedio character varying(255)
);
     DROP TABLE public.calificacion;
       public         heap    postgres    false            �            1259    25337    ciudad    TABLE     �   CREATE TABLE public.ciudad (
    idciudad uuid NOT NULL,
    nombre character varying(255),
    zonahoraria character varying(255)
);
    DROP TABLE public.ciudad;
       public         heap    postgres    false            �            1259    25344 
   estudiante    TABLE     �   CREATE TABLE public.estudiante (
    idestudiante uuid NOT NULL,
    ciudad character varying(255),
    edad integer NOT NULL,
    nombre character varying(255),
    zona_horaria character varying(255)
);
    DROP TABLE public.estudiante;
       public         heap    postgres    false            �            1259    25351    examen    TABLE     ^   CREATE TABLE public.examen (
    idexamen uuid NOT NULL,
    nombre character varying(255)
);
    DROP TABLE public.examen;
       public         heap    postgres    false            �            1259    25356    fechaexamen    TABLE     �   CREATE TABLE public.fechaexamen (
    idfechaexamen uuid NOT NULL,
    fecha timestamp without time zone,
    idexamen uuid,
    zona_horaria character varying(255)
);
    DROP TABLE public.fechaexamen;
       public         heap    postgres    false            �            1259    25361    fechaexamenzona    TABLE     �   CREATE TABLE public.fechaexamenzona (
    ide_fecha_examen_zona uuid NOT NULL,
    idestudiante uuid,
    idfechaexamen uuid
);
 #   DROP TABLE public.fechaexamenzona;
       public         heap    postgres    false            �            1259    25133    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public          postgres    false            �            1259    25366 	   preguntas    TABLE     x   CREATE TABLE public.preguntas (
    idpregunta uuid NOT NULL,
    idexamen uuid,
    pregunta character varying(255)
);
    DROP TABLE public.preguntas;
       public         heap    postgres    false            �            1259    25371 
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
       public         heap    postgres    false            �            1259    25378    respuestas_estudiante    TABLE     �   CREATE TABLE public.respuestas_estudiante (
    id_respuesta_estudiante uuid NOT NULL,
    idestudiante uuid,
    idexamen uuid,
    idpregunta uuid,
    respuesta character varying(255)
);
 )   DROP TABLE public.respuestas_estudiante;
       public         heap    postgres    false                      0    25332    calificacion 
   TABLE DATA           X   COPY public.calificacion (idcalificacion, idestudiante, idexamen, promedio) FROM stdin;
    public          postgres    false    210   �'                 0    25337    ciudad 
   TABLE DATA           ?   COPY public.ciudad (idciudad, nombre, zonahoraria) FROM stdin;
    public          postgres    false    211   �(                 0    25344 
   estudiante 
   TABLE DATA           V   COPY public.estudiante (idestudiante, ciudad, edad, nombre, zona_horaria) FROM stdin;
    public          postgres    false    212   �(                 0    25351    examen 
   TABLE DATA           2   COPY public.examen (idexamen, nombre) FROM stdin;
    public          postgres    false    213   6)                  0    25356    fechaexamen 
   TABLE DATA           S   COPY public.fechaexamen (idfechaexamen, fecha, idexamen, zona_horaria) FROM stdin;
    public          postgres    false    214   �)       !          0    25361    fechaexamenzona 
   TABLE DATA           ]   COPY public.fechaexamenzona (ide_fecha_examen_zona, idestudiante, idfechaexamen) FROM stdin;
    public          postgres    false    215   �)       "          0    25366 	   preguntas 
   TABLE DATA           C   COPY public.preguntas (idpregunta, idexamen, pregunta) FROM stdin;
    public          postgres    false    216   �)       #          0    25371 
   respuestas 
   TABLE DATA           k   COPY public.respuestas (idrespuesta, correcta, idpregunta, opcion1, opcion2, opcion3, opcion4) FROM stdin;
    public          postgres    false    217   �*       $          0    25378    respuestas_estudiante 
   TABLE DATA           w   COPY public.respuestas_estudiante (id_respuesta_estudiante, idestudiante, idexamen, idpregunta, respuesta) FROM stdin;
    public          postgres    false    218   �+       +           0    0    hibernate_sequence    SEQUENCE SET     @   SELECT pg_catalog.setval('public.hibernate_sequence', 4, true);
          public          postgres    false    209            }           2606    25336    calificacion calificacion_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.calificacion
    ADD CONSTRAINT calificacion_pkey PRIMARY KEY (idcalificacion);
 H   ALTER TABLE ONLY public.calificacion DROP CONSTRAINT calificacion_pkey;
       public            postgres    false    210                       2606    25343    ciudad ciudad_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.ciudad
    ADD CONSTRAINT ciudad_pkey PRIMARY KEY (idciudad);
 <   ALTER TABLE ONLY public.ciudad DROP CONSTRAINT ciudad_pkey;
       public            postgres    false    211            �           2606    25350    estudiante estudiante_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.estudiante
    ADD CONSTRAINT estudiante_pkey PRIMARY KEY (idestudiante);
 D   ALTER TABLE ONLY public.estudiante DROP CONSTRAINT estudiante_pkey;
       public            postgres    false    212            �           2606    25355    examen examen_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.examen
    ADD CONSTRAINT examen_pkey PRIMARY KEY (idexamen);
 <   ALTER TABLE ONLY public.examen DROP CONSTRAINT examen_pkey;
       public            postgres    false    213            �           2606    25360    fechaexamen fechaexamen_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.fechaexamen
    ADD CONSTRAINT fechaexamen_pkey PRIMARY KEY (idfechaexamen);
 F   ALTER TABLE ONLY public.fechaexamen DROP CONSTRAINT fechaexamen_pkey;
       public            postgres    false    214            �           2606    25365 $   fechaexamenzona fechaexamenzona_pkey 
   CONSTRAINT     u   ALTER TABLE ONLY public.fechaexamenzona
    ADD CONSTRAINT fechaexamenzona_pkey PRIMARY KEY (ide_fecha_examen_zona);
 N   ALTER TABLE ONLY public.fechaexamenzona DROP CONSTRAINT fechaexamenzona_pkey;
       public            postgres    false    215            �           2606    25370    preguntas preguntas_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.preguntas
    ADD CONSTRAINT preguntas_pkey PRIMARY KEY (idpregunta);
 B   ALTER TABLE ONLY public.preguntas DROP CONSTRAINT preguntas_pkey;
       public            postgres    false    216            �           2606    25382 0   respuestas_estudiante respuestas_estudiante_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.respuestas_estudiante
    ADD CONSTRAINT respuestas_estudiante_pkey PRIMARY KEY (id_respuesta_estudiante);
 Z   ALTER TABLE ONLY public.respuestas_estudiante DROP CONSTRAINT respuestas_estudiante_pkey;
       public            postgres    false    218            �           2606    25377    respuestas respuestas_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT respuestas_pkey PRIMARY KEY (idrespuesta);
 D   ALTER TABLE ONLY public.respuestas DROP CONSTRAINT respuestas_pkey;
       public            postgres    false    217            �           2606    25388 &   respuestas fkgaet1gr386n9ojbtirhq7jgsk    FK CONSTRAINT     �   ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT fkgaet1gr386n9ojbtirhq7jgsk FOREIGN KEY (idpregunta) REFERENCES public.preguntas(idpregunta);
 P   ALTER TABLE ONLY public.respuestas DROP CONSTRAINT fkgaet1gr386n9ojbtirhq7jgsk;
       public          postgres    false    3209    217    216            �           2606    25383 %   preguntas fktqcswmee5j0l8cc7vq3te7cma    FK CONSTRAINT     �   ALTER TABLE ONLY public.preguntas
    ADD CONSTRAINT fktqcswmee5j0l8cc7vq3te7cma FOREIGN KEY (idexamen) REFERENCES public.examen(idexamen);
 O   ALTER TABLE ONLY public.preguntas DROP CONSTRAINT fktqcswmee5j0l8cc7vq3te7cma;
       public          postgres    false    213    216    3203               �   x���ɍ1D�ݹ����r���� ��T%���Viʰ����l4�=Q�D��A<D���`E$��bY�b�i>�ZY�`�mw�������~�;��C�r�����[�L6����=-r���gY�y.���?4
�2�;�����Ro���;�v�o�5��2�_�'^0�d��7˷ƿ�������         =   x�37H��HLJ�5H5M�51L1�ML6M�5L�0642K46L4�LNɭ�t��5����� 9I         E   x�30H366M2�5NM6�5ILL�ML33�M653IKNL5�0O�LNɭ�42�,H-H�t��5����� ��         <   x�K�H1757��5JK��5IL��bs]�d��4�$��ĔN�Ē��Ē���b�=... ��k             x������ � �      !      x������ � �      "     x���9n�0E��)�d�T�� i(�
(v�e�9��l�ￏ	K&(��$H1CEc��`Q�M�SH�6A�T2�I`*ֆe"b�}�Ե�Z��S_7͢?ge}��4U��%��Z���J�i�r�"�7�Gt�<A�R���qDR���y9�&�����.z9d�.�kI���z�Rg�F�	A�08[-x�y�u�a�\+�>/���@Y�fE���1�ɍ��9��'6��N��S �_ir�}(���e�w=n�>���ޕR����      #     x�]���X1c�^xG|��' A�%X��ٞavQ�+OÝ�A��Z�KO�8�8l[z܂�� �.X�ñI�d�����:�G�9��6&"��B�85�֖2Htu�B�y1��F��)4����8�^=��Z� �����ɵ�	�1c���+_�Ad,؋jm������\��)e�Ig0Y�mt�T${�1תzݘ�����&���r��:����EO��z��#�[ݣO�9O���k��@�'p���
��C���~�|��0�o�      $   %  x����0Cϻ���1��K.`��Bz؃4�Ľ���3����r�TY�r���V�s���w���Y�]�~^G%>�)W�v��`��z�Zc�g~T4̳ \�I*A��.|E��C��׌ ��������!�C*$�����%�9��"H7:;��=T�<*��I�=�@��q�2�)����j�tD~A.��>�>���w�Bh���;ps�����R���*>������/u����ա�0�D�Ac�ی�0��*�LSo΄cD�q,�c��u��������Ǌ     