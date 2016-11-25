INSERT INTO public.tipopagador (id, codigo, descripcion) VALUES (1, 1, 'Empleador');
INSERT INTO public.tipopagador (id, codigo, descripcion) VALUES (2, 2, 'Administrador Pensiones');
INSERT INTO public.tipopagador (id, codigo, descripcion) VALUES (3, 3, 'Pagador pensiones');
INSERT INTO public.tipopagador (id, codigo, descripcion) VALUES (4, 4, 'Pensiones de entidades');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (1, 1, 'Pensionado Regimen prima media.Tope maximo 25 smlv');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (2, 2, 'Pensionado Regimen prima media.Sin tope maximo');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (3, 3, 'Pensionado Regimen ahorro individual.No aplica tope maximo');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (4, 4, 'Pensionado Riesgos Laborales.Tope maximo 25smlv');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (5, 5, 'Pensionado empleador.Tope maximo 25 smlv');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (6, 6, 'Pensionado empleador.Sin tope maximo');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (7, 7, 'Pensionado entidades especiales.Tope maximo 25 smlv');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (8, 8, 'Pensionado entidades especiales.Sin tope maximo');
INSERT INTO public.tipopensionado (id, codigo, descripcion) VALUES (9, 9, 'Beneficiario UPC Adicional');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (1, 1, 'Vejez');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (2, 2, 'Sobrevivencia vitalicia riesgo comun');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (3, 3, 'Sobrevivencia temporal sin riesgo comun');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (4, 4, 'Sobrevivencia temporal riesgo comun');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (5, 5, 'Sobrevivencia vitalicia por riesgo laboral');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (6, 6, 'Sobrevivencia temporal riesgo laboral');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (7, 7, 'Sobrevivencia temporal riesgo laboral, conyugue');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (8, 8, 'Invalidez riesgo comun');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (9, 9, 'Invalidez riesgo laboral');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (10, 10, 'Jubilacion');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (11, 11, 'Jubilacion para compartir');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (12, 12, 'Sancion');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (13, 13, 'Convencional');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (14, 14, 'Convencional para compartir');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (15, 15, 'Gracia');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (16, 16, 'Por convenio internacional');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (17, 20, 'Sentencia judicial');
INSERT INTO public.tipopension (id, codigo, descripcion) VALUES (18, 21, 'conciliacion');
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (1, 2);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (1, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (2, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (2, 2);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (2, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (2, 4);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (3, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (3, 2);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (3, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (3, 4);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (4, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (4, 2);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (4, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (4, 4);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (5, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (6, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (7, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (8, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (8, 2);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (8, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (8, 4);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (9, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (10, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (10, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (10, 4);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (11, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (11, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (12, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (13, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (13, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (14, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (14, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (15, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (16, 2);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (17, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (17, 2);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (17, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (17, 4);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (18, 1);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (18, 2);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (18, 3);
INSERT INTO public.tipopension_tipopagador (tipopension_id, tipopagador_id) VALUES (18, 4);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (1, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (1, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (1, 3);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (2, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (2, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (2, 3);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (2, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (2, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (2, 7);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (2, 8);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (3, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (3, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (3, 3);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (3, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (3, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (3, 7);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (3, 8);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (4, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (4, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (4, 3);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (4, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (4, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (4, 7);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (4, 8);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (5, 4);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (5, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (5, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (6, 4);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (6, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (6, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (7, 4);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (7, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (7, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (8, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (8, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (8, 3);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (8, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (8, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (8, 7);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (8, 8);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (9, 4);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (10, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (10, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (10, 7);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (10, 8);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (11, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (11, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (11, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (11, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (11, 7);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (11, 8);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (12, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (12, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (13, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (13, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (14, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (14, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (14, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (14, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (15, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (15, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (16, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (17, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (17, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (17, 3);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (17, 4);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (17, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (17, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (17, 7);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (17, 8);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (18, 1);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (18, 2);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (18, 4);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (18, 5);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (18, 6);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (18, 7);
INSERT INTO public.tipopension_tipopensionado (tipopension_id, tipopensionado_id) VALUES (18, 8);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (1, 1);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (1, 2);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (1, 3);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (2, 2);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (2, 3);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (3, 2);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (4, 3);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (5, 1);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (6, 1);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (7, 4);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (8, 4);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (9, 1);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (9, 2);
INSERT INTO public.tipopensionado_tipopagador (tipopensionado_id, tipopagadorpensionado_id) VALUES (9, 3);