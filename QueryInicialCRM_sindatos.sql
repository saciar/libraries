DROP DATABASE crm;
CREATE DATABASE crm;

use crm;


CREATE TABLE `MST_CLIENTE` (
  `cl_codcliente` bigint UNSIGNED NOT NULL default '0',
  `cl_cod_bejerman` mediumint UNSIGNED default NULL,
  `nombre_fantasia` varchar(60) NOT NULL default '',
  `cl_titulo` tinyint(4) UNSIGNED NOT NULL default '0',
  `apynom` varchar(60) NOT NULL default '',
  `empresa` varchar(60) NOT NULL default '',
  `email` varchar(50) default NULL,
  `telefono1` varchar(20) NOT NULL default '',
  `telefono2` varchar(20) default NULL,
  `nextel_flota` int(11) UNSIGNED default NULL,
  `nextel_id` int(11) UNSIGNED default NULL,
  `fax` varchar(20) default NULL,
  `cl_referencia` smallint(6) UNSIGNED default NULL,
  `domleg_calle` varchar(50) default NULL,
  `domleg_nro` smallint(6) UNSIGNED default NULL,
  `domleg_piso` tinyint UNSIGNED default NULL,
  `domleg_dpto` char(2) default NULL,
  `domleg_cp` mediumint UNSIGNED default NULL,
  `domleg_loc` mediumint UNSIGNED default NULL,
  `domleg_codpartido` mediumint UNSIGNED default NULL,
  `domleg_codprovincia` smallint UNSIGNED default NULL,
  `domleg_codpais` smallint UNSIGNED default NULL,
  `CUIT` bigint(20) UNSIGNED default NULL,
  `cl_iva` tinyint(4) UNSIGNED default NULL,
  `pago_contacto` varchar(40) default NULL,
  `pago_telefono` varchar(20) default NULL,
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`cl_codcliente`));
ALTER TABLE `crm`.`MST_CLIENTE` ENGINE = InnoDB;

CREATE TABLE `MST_CLIENTE_FACT` (
  `cf_codcliente` bigint UNSIGNED NOT NULL default '0',
  `cf_calle` varchar(50) NOT NULL default '',
  `cf_nro` smallint UNSIGNED NOT NULL default '0',
  `cf_piso` varchar(2) NOT NULL default '',
  `cf_dpto` varchar(2) NOT NULL default '',
  `cf_cp` mediumint UNSIGNED NOT NULL default '0',
  `cf_loc` mediumint UNSIGNED NOT NULL default '0',
  `cf_codpartido` mediumint UNSIGNED NOT NULL default '0',
  `cf_codprovincia` smallint UNSIGNED NOT NULL default '0',
  `cf_codpais` smallint UNSIGNED NOT NULL default '0',
  `cf_dia_hora_pago` datetime NOT NULL default '1999-01-01 01:00:00',
  `cf_domic_pago` varchar(80) NOT NULL default '',
  `cf_codprovcrn` varchar(20) NOT NULL default '',
  PRIMARY KEY  (`cf_codcliente`));
ALTER TABLE `crm`.`MST_CLIENTE_FACT` ENGINE = InnoDB;


CREATE TABLE `MST_CONDIVA` (
  `iv_codcond` smallint(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `iv_descripcond` varchar(30) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`iv_codcond`),
  UNIQUE KEY (iv_descripcond));
ALTER TABLE `crm`.`MST_CONDIVA` ENGINE = InnoDB;

CREATE TABLE `MST_LOCALIDAD` (
  `lc_id` mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
  `lc_codpartido` mediumint UNSIGNED NOT NULL default '0',
  `lc_codlocalidad` mediumint UNSIGNED NOT NULL default '0',
  `lc_descriplocalidad` varchar(50) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`lc_id`),
  UNIQUE KEY (`lc_codlocalidad`, `lc_codpartido`));
ALTER TABLE `crm`.`MST_LOCALIDAD` ENGINE = InnoDB;

CREATE TABLE `MST_PAIS` (
  `ps_codpais` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `ps_descrippais` varchar(30) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`ps_codpais`),
  UNIQUE KEY `ps_descrippais` (`ps_descrippais`));
ALTER TABLE `crm`.`MST_PAIS` ENGINE = InnoDB;

CREATE TABLE `MST_PARTIDO` (
  `pt_id` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `pt_codprovincia` smallint UNSIGNED NOT NULL default '0',
  `pt_codpartido` mediumint UNSIGNED NOT NULL default '0',
  `pt_descrippartido` varchar(30) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`pt_id`),
  UNIQUE KEY (`pt_codpartido`, `pt_codprovincia`));
ALTER TABLE `crm`.`MST_PARTIDO` ENGINE = InnoDB;

CREATE TABLE `MST_PROVINCIA` (
  `pv_id` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `pv_codpais` smallint UNSIGNED NOT NULL default '0',
  `pv_codprovincia` smallint UNSIGNED NOT NULL default '0',
  `pv_descripprovincia` varchar(30) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`pv_id`),
  UNIQUE KEY (`pv_codprovincia`, `pv_codpais`));
ALTER TABLE `crm`.`MST_PROVINCIA` ENGINE = InnoDB;

CREATE TABLE `MST_REFERENCIA` (
  `rf_codref` smallint(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL default '',
  `rf_categoria` tinyint(6) UNSIGNED default NULL,
  rf_codcomi smallint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  UNIQUE KEY (nombre),
  PRIMARY KEY  (`rf_codref`));
ALTER TABLE `crm`.`MST_REFERENCIA` ENGINE = InnoDB;

CREATE TABLE `MST_TITULOS` (
  `tt_codtit` tinyint(4) UNSIGNED NOT NULL AUTO_INCREMENT,
  `descriptit` varchar(15) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`tt_codtit`),
  UNIQUE KEY (descriptit));
ALTER TABLE `crm`.`MST_TITULOS` ENGINE = InnoDB;

CREATE TABLE `MST_COMISIONES` (
  `cm_codcomi` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `cm_codvend` smallint UNSIGNED NOT NULL default '0',
  porcentaje tinyint UNSIGNED NOT NULL default '0',
  cm_marco_liquidacion tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`cm_codcomi`),
  UNIQUE KEY (cm_codvend, porcentaje));
ALTER TABLE `crm`.`MST_COMISIONES` ENGINE = InnoDB;

CREATE TABLE `MST_VENDEDORES` (
  `vd_codvend` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `apynom` varchar(40) NOT NULL default '',
  `vd_categoria` tinyint UNSIGNED NOT NULL default '0',
  `fecing` datetime NOT NULL,
  `nextel_flota` smallint UNSIGNED default NULL,
  `nextel_id` smallint UNSIGNED default NULL,
  codequipo tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`vd_codvend`),
  UNIQUE KEY (apynom));
ALTER TABLE `crm`.`MST_VENDEDORES` ENGINE = InnoDB;


CREATE TABLE `MST1_VEND_USR` (
  `vus_codvend` smallint UNSIGNED NOT NULL default '0',
  `vus_codusuario` smallint UNSIGNED NOT NULL default '0',
  PRIMARY KEY  (`vus_codvend`),
  UNIQUE KEY (vus_codusuario));
ALTER TABLE `crm`.`MST1_VEND_USR` ENGINE = InnoDB;



CREATE TABLE `MST_CATVEND` (
  `cv_catvend` tinyint UNSIGNED NOT NULL default '0',
  `descripcatvend` varchar(30) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`cv_catvend`),
  UNIQUE KEY (descripcatvend));
ALTER TABLE `crm`.`MST_CATVEND` ENGINE = InnoDB;
CREATE TABLE `MST_CATREF` (
  `cr_catref` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `descripcatref` varchar(30) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`cr_catref`),
  UNIQUE KEY (descripcatref));
ALTER TABLE `crm`.`MST_CATREF` ENGINE = InnoDB;
CREATE TABLE `MST_CODIGOPOSTAL` (
  `cp_id` mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
  `cp_codpostal` mediumint UNSIGNED NOT NULL default '0',
  `cp_codlocalidad` mediumint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`cp_id`),
  UNIQUE KEY (cp_codpostal, cp_codlocalidad));
ALTER TABLE `crm`.`MST_CODIGOPOSTAL` ENGINE = InnoDB;
CREATE TABLE `MST_USUARIOS` (
  `us_codusuario` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `login_name` varchar(15) NOT NULL default '',
  `password` varchar(16) NOT NULL default '',
  `apynom` varchar(40) NOT NULL default '',
  `us_perfil` tinyint UNSIGNED NOT NULL default '0',
  `email` varchar(50) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`us_codusuario`),
  UNIQUE KEY (login_name),
  UNIQUE KEY (email));
ALTER TABLE `crm`.`MST_USUARIOS` ENGINE = InnoDB;
CREATE TABLE `MST_PERFILES` (
  `pf_codperfil` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `descripperfil` varchar(30) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`pf_codperfil`),
  UNIQUE KEY (descripperfil));
ALTER TABLE `crm`.`MST_PERFILES` ENGINE = InnoDB;
CREATE TABLE `MST_ACCESOS` (
  `ax_codacceso` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `descripacceso` varchar(60) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`ax_codacceso`),
  UNIQUE KEY (descripacceso));
ALTER TABLE `crm`.`MST_ACCESOS` ENGINE = InnoDB;
CREATE TABLE `MST_OPERADORES` (
  `op_codoper` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `apynom` varchar(40) NOT NULL default '',
  modalidad_oper tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`op_codoper`),
  UNIQUE KEY (apynom));
ALTER TABLE `crm`.`MST_OPERADORES` ENGINE = InnoDB;
CREATE TABLE `MST_ASISTENTES` (
  `as_codasist` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `apynom` varchar(40) NOT NULL default '',
  modalidad_asist tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`as_codasist`),
  UNIQUE KEY (apynom));
ALTER TABLE `crm`.`MST_ASISTENTES` ENGINE = InnoDB;
CREATE TABLE `MST_MODALIDAD_CONTRATACION` (
  `mc_codmodalidad` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `descripmodalidad` varchar(40) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`mc_codmodalidad`),
  UNIQUE KEY (descripmodalidad));
ALTER TABLE `crm`.`MST_MODALIDAD_CONTRATACION` ENGINE = InnoDB;
CREATE TABLE `MST_EVT_LUGAR` (
  `el_codlugar` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `el_nombrelugar` varchar(50) NOT NULL default '',
  `el_contacto` varchar(25) default NULL,
  `el_telefono1` varchar(20) NOT NULL default '',
  `el_telefono2` varchar(20) default NULL,
  `el_fax` varchar(20) default NULL,
  `el_nextel_flota` smallint UNSIGNED default NULL,
  `el_nextel_id` smallint UNSIGNED default NULL,
  `el_email` varchar(25) default NULL,
  `el_calle` varchar(25) NOT NULL default '',
  `el_nro` smallint UNSIGNED NOT NULL default '0',
  `el_piso` tinyint UNSIGNED default NULL,
  `el_dpto` char(2) default NULL,
  `el_cp` mediumint UNSIGNED NOT NULL default '0',
  `el_loc` mediumint UNSIGNED NOT NULL default '0',
  `el_codpartido` mediumint UNSIGNED NOT NULL default '0',
  `el_codprovincia` smallint UNSIGNED NOT NULL default '0',
  `el_codpais` smallint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`el_codlugar`),
  UNIQUE KEY (el_nombrelugar));
ALTER TABLE `crm`.`MST_EVT_LUGAR` ENGINE = InnoDB;
CREATE TABLE `MST_EVT_TIPO` (
  `et_codtipo` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `et_descripcion` varchar(25) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`et_codtipo`),
  UNIQUE KEY (et_descripcion));
ALTER TABLE `crm`.`MST_EVT_TIPO` ENGINE = InnoDB;
CREATE TABLE `MST_EVT_TIPOLUGAR` (
  `etl_codtipo` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `etl_descripcion` varchar(25) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`etl_codtipo`),
  UNIQUE KEY (etl_descripcion));
ALTER TABLE `crm`.`MST_EVT_TIPOLUGAR` ENGINE = InnoDB;
CREATE TABLE `MST_EVT_UNIFORME` (
  `eu_codtipo` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `eu_descripcion` varchar(25) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`eu_codtipo`),
  UNIQUE KEY (eu_descripcion));
ALTER TABLE `crm`.`MST_EVT_UNIFORME` ENGINE = InnoDB;
CREATE TABLE `MST_PROVEEDORES` (
  `pr_codproveedor` smallint UNSIGNED NOT NULL default '0',
  `pr_nombreproveedor` varchar(50) NOT NULL default '',
  `pr_contacto` varchar(25) NOT NULL default '',
  `pr_telefono1` varchar(20) NOT NULL default '',
  `pr_telefono2` varchar(20) default NULL,
  `pr_fax` varchar(20) default NULL,
  `pr_nextel_flota` smallint UNSIGNED default NULL,
  `pr_nextel_id` smallint UNSIGNED default NULL,
  `pr_email` varchar(25) default NULL,
  `pr_calle` varchar(25) NOT NULL default '',
  `pr_nro` smallint UNSIGNED NOT NULL default '0',
  `pr_piso` tinyint UNSIGNED default NULL,
  `pr_dpto` char(2) default NULL,
  `pr_cp` mediumint UNSIGNED NOT NULL default '0',
  `pr_loc` mediumint UNSIGNED NOT NULL default '0',
  `pr_codpartido` mediumint UNSIGNED NOT NULL default '0',
  `pr_codprovincia` smallint UNSIGNED NOT NULL default '0',
  `pr_codpais` smallint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`pr_codproveedor`),
  UNIQUE KEY (pr_nombreproveedor));
ALTER TABLE `crm`.`MST_PROVEEDORES` ENGINE = InnoDB;
CREATE TABLE `MST_FAM_SERVICIOS` (
  `fs_codfamilia` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `fs_descripcion` varchar(60) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`fs_codfamilia`),
  UNIQUE KEY (fs_descripcion));
ALTER TABLE `crm`.`MST_FAM_SERVICIOS` ENGINE = InnoDB;
CREATE TABLE `MST_SERVICIOS` (
  `se_codservicio` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `se_familia` tinyint UNSIGNED NOT NULL default '0',
  `se_preciovta` decimal(10,2) NOT NULL default '0',
  `se_preciovta_minimo` decimal(10,2) NOT NULL default '0',
  `se_adm_descuento` char(1) NOT NULL default '',
  `se_adm_sincargo` char(1) NOT NULL default '0',
  `se_peso` decimal(6,2) default NULL,
  `se_largo` decimal(6,2) default NULL,
  `se_altura` decimal(6,2) default NULL,
  `se_ancho` decimal(6,2) default NULL,
  `se_accesorio` char(1) NOT NULL default '',
  `se_activo` char(1) NOT NULL default '',
  `se_unidad_negocio` tinyint UNSIGNED NOT NULL default '0',
  PRIMARY KEY  (`se_codservicio`));
ALTER TABLE `crm`.`MST_SERVICIOS` ENGINE = InnoDB;
CREATE TABLE `MST_SUBSERVICIOS` (
  `se_codservicio` smallint UNSIGNED NOT NULL default '0',
  `se_descripcion` varchar(250) NOT NULL default '',
  `se_descrip_abreviada` varchar(40) NOT NULL default '',
  `se_peso` decimal default NULL,
  `se_largo` decimal default NULL,
  `se_altura` decimal default NULL,
  `se_ancho` decimal default NULL,
  `se_accesorio` char(1) default NULL,
  `se_activo` char(1) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`se_codservicio`),
  UNIQUE KEY (se_descripcion),
  UNIQUE KEY (se_descrip_abreviada));
ALTER TABLE `crm`.`MST_SUBSERVICIOS` ENGINE = InnoDB;
CREATE TABLE `crm`.`MST_ACC_INSTALACION` (
  `ai_codint` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `ai_codacc` smallint UNSIGNED NOT NULL default '0',
  `ai_codfamilia_acc` smallint UNSIGNED NOT NULL default '0',
  `ai_codfamilia_srv` tinyint UNSIGNED NOT NULL default '0',
  `ai_descripcion` varchar(250) NOT NULL default '',
  `ai_descrip_abreviada` varchar(40) NOT NULL default '',
  `ai_preciovta` decimal NOT NULL default '0',
  `ai_adm_descuento` char(1) NOT NULL default '0',
  `ai_adm_sincargo` char(1) NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`ai_codint`),
  UNIQUE KEY (ai_codacc, ai_codfamilia_acc, ai_codfamilia_srv));
ALTER TABLE `crm`.`MST_ACC_INSTALACION` ENGINE = InnoDB;
CREATE TABLE `MST_FLIA_ACC_INST` (
  `fai_codfamilia` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `fai_descripcion` varchar(40) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`fai_codfamilia`));
ALTER TABLE `crm`.`MST_FLIA_ACC_INST` ENGINE = InnoDB;
CREATE TABLE `MST_EVT_LUGAR_SALAS` (
  `els_codlugsala` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `els_codsala` tinyint UNSIGNED NOT NULL default '0',
  `els_codlugar` smallint UNSIGNED NOT NULL default '0',
  `els_descripcion` varchar(50) NOT NULL default '',
  `els_largo` decimal(6,2) default NULL,
  `els_ancho` decimal(6,2) default NULL,
  `els_altura` decimal(6,2) default NULL,
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY (`els_codlugsala`),
  UNIQUE KEY (els_codsala, els_codlugar));
ALTER TABLE `crm`.`MST_EVT_LUGAR_SALAS` ENGINE = InnoDB;
CREATE TABLE `MST_USR_ACCESOS` (
  `ua_codusuario` smallint UNSIGNED NOT NULL default '0',
  `ua_codacceso` tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`ua_codusuario`, `ua_codacceso`));
ALTER TABLE `crm`.`MST_USR_ACCESOS` ENGINE = InnoDB;
CREATE TABLE `MST_DTO_PRECIOS_DIAS` (
  `dp_coddescuento` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `dp_codservicio` smallint UNSIGNED NOT NULL default '0',
  `dp_techo_dias` smallint UNSIGNED NOT NULL default '0',
  `dp_porcentaje_dto` tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`dp_coddescuento`),
  UNIQUE KEY (dp_codservicio, dp_techo_dias));
ALTER TABLE `crm`.`MST_DTO_PRECIOS_DIAS` ENGINE = InnoDB;
CREATE TABLE `MST_LISTAS_CUSTOM` (
  `lc_codlista` smallint UNSIGNED NOT NULL default '0',
  `lc_codlugar` smallint UNSIGNED NOT NULL default '0',
  `lc_descripcion` varchar(40) NOT NULL default '',
  `lc_variacion` tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`lc_codlista`),
  UNIQUE KEY (lc_codlugar));
ALTER TABLE `crm`.`MST_LISTAS_CUSTOM` ENGINE = InnoDB;
CREATE TABLE `MST_UNIDAD_NEGOCIO` (
  `un_codnegocio` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `un_descripcion` varchar(40) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`un_codnegocio`),
  UNIQUE KEY (`un_descripcion`));
ALTER TABLE `crm`.`MST_UNIDAD_NEGOCIO` ENGINE = InnoDB;
CREATE TABLE `MST_SUCURSALES` (
  `su_codsucursal` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `su_descripcion` varchar(40) NOT NULL default '',
  `su_mail_os` varchar(50) NOT NULL default '',
  `su_mail_of` varchar(50) NOT NULL default '',
  `su_mail_template` text NOT NULL default '',
  `su_logo` varchar(50) NOT NULL default '',
  `su_header` varchar(50) NOT NULL default '',
  `su_footer` varchar(50) NOT NULL default '',
  `su_calle` varchar(25) NOT NULL default '',
  `su_nro` smallint UNSIGNED NOT NULL default '0',
  `su_piso` tinyint UNSIGNED default NULL,
  `su_dpto` char(2) default NULL,
  `su_cp` mediumint UNSIGNED NOT NULL default '0',
  `su_loc` mediumint UNSIGNED NOT NULL default '0',
  `su_codpartido` mediumint UNSIGNED NOT NULL default '0',
  `su_codprovincia` smallint UNSIGNED NOT NULL default '0',
  `su_codpais` smallint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`su_codsucursal`),
  UNIQUE KEY (`su_descripcion`));
ALTER TABLE `crm`.`MST_SUCURSALES` ENGINE = InnoDB;
CREATE TABLE `MST_IDIOMAS` (
  `id_codidioma` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_descripcion` varchar(40) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`id_codidioma`),
  UNIQUE KEY (`id_descripcion`));
ALTER TABLE `crm`.`MST_IDIOMAS` ENGINE = InnoDB;
CREATE TABLE `MST_SERVICIOS_IDIOMA` (
  `si_codservicio` smallint UNSIGNED NOT NULL AUTO_INCREMENT,
  `si_codidioma` tinyint UNSIGNED NOT NULL default '0',
  `si_descripcion` varchar(250) NOT NULL default '',
  `si_descripcion_abreviada` varchar(40) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`si_codservicio`, `si_codidioma`));
ALTER TABLE `crm`.`MST_SERVICIOS_IDIOMA` ENGINE = InnoDB;
CREATE TABLE `MST_UNIDADES_COMERCIALES` (
  `uc_codunidad` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `uc_codsucursal` tinyint UNSIGNED NOT NULL default '0',
  `uc_descripcion` varchar(40) NOT NULL default '',
  `uc_codsupervisor` smallint UNSIGNED NOT NULL default '0',
  `uc_obj_global` decimal NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`uc_codunidad`,`uc_codsucursal`),
  UNIQUE KEY (uc_descripcion),
  UNIQUE KEY (uc_codsupervisor));
ALTER TABLE `crm`.`MST_UNIDADES_COMERCIALES` ENGINE = InnoDB;
CREATE TABLE `MST_UNIDADES_VENDEDORES` (
  `ucv_codunidad` tinyint UNSIGNED NOT NULL default '0',
  `ucv_codvendedor` smallint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`ucv_codunidad`, `ucv_codvendedor`));
ALTER TABLE `crm`.`MST_UNIDADES_VENDEDORES` ENGINE = InnoDB;
CREATE TABLE `MST_UNIDADES_BONUS` (
  `ucb_codunidad` tinyint UNSIGNED NOT NULL default '0',
  `ucb_nivel` tinyint UNSIGNED NOT NULL default '0',
  `ucb_objetivo` decimal NOT NULL default '0',
  `ucb_bonus_equipo` decimal(10,2) NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`ucb_codunidad`, `ucb_nivel`));
ALTER TABLE `crm`.`MST_UNIDADES_BONUS` ENGINE = InnoDB;
CREATE TABLE `MST_UNIDADES_PRECIOS` (
  `up_codunidad` tinyint UNSIGNED NOT NULL default '0',
  `up_codlista` smallint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`up_codunidad`, `up_codlista`));
ALTER TABLE `crm`.`MST_UNIDADES_PRECIOS` ENGINE = InnoDB;
CREATE TABLE `MST_MARCOS_LIQUIDACION` (
  `ml_codmarco` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `ml_descripcion` varchar(40) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`ml_codmarco`),
  UNIQUE KEY (ml_descripcion));
ALTER TABLE `crm`.`MST_MARCOS_LIQUIDACION` ENGINE = InnoDB;
CREATE TABLE `MST_CONDICIONES_PAGO` (
  `cpa_codcondicion` tinyint UNSIGNED NOT NULL default '0',
  `cpa_descripcion` varchar(40) NOT NULL default '',
  `cpa_descrip_detallada` varchar(100) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`cpa_codcondicion`),
  UNIQUE KEY (cpa_descripcion));
ALTER TABLE `crm`.`MST_CONDICIONES_PAGO` ENGINE = InnoDB;
CREATE TABLE `MST_MEDIOS_PAGO` (
  `cmp_codmedio` tinyint UNSIGNED NOT NULL default '0',
  `cmp_descripcion` varchar(40) NOT NULL default '',
  `cmp_descrip_detallada` varchar(100) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`cmp_codmedio`),
  UNIQUE KEY (cmp_descripcion));
ALTER TABLE `crm`.`MST_MEDIOS_PAGO` ENGINE = InnoDB;
CREATE TABLE `MST_CATEGORIA_EVENTO` (
  `ce_codcategoria` tinyint UNSIGNED NOT NULL default '0',
  `ce_descripcion` varchar(40) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`ce_codcategoria`),
  UNIQUE KEY (ce_descripcion));
ALTER TABLE `crm`.`MST_CATEGORIA_EVENTO` ENGINE = InnoDB;
CREATE TABLE `MST_ESTADO_EVENTO` (
  `eev_codestado` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `eev_descripcion` varchar(40) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`eev_codestado`),
  UNIQUE KEY (eev_descripcion));
ALTER TABLE `crm`.`MST_ESTADO_EVENTO` ENGINE = InnoDB;
CREATE TABLE `MST_GERENCIAS_COMERCIALES` (
  `gc_codgerencia` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `gc_descripcion` varchar(40) NOT NULL default '',
  `gc_codgerente` smallint UNSIGNED NOT NULL,
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`gc_codgerencia`),
  UNIQUE KEY (gc_descripcion),
  UNIQUE KEY (gc_codgerente));
ALTER TABLE `crm`.`MST_GERENCIAS_COMERCIALES` ENGINE = InnoDB;
CREATE TABLE `MST_GC_UNIDADES` (
  `gcu_id` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `gcu_codgerencia` tinyint UNSIGNED NOT NULL default '0',
  `gcu_codunidad` tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`gcu_id`),
  UNIQUE KEY (gcu_codgerencia, gcu_codunidad));
ALTER TABLE `crm`.`MST_GC_UNIDADES` ENGINE = InnoDB;
CREATE TABLE `MST_GC_ESCALAS` (
  `gce_id` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `gce_codgerencia` tinyint UNSIGNED NOT NULL default '0',
  `gce_escala` decimal(10,2) NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`gce_id`),
  UNIQUE KEY (gce_codgerencia, gce_escala));
ALTER TABLE `crm`.`MST_GC_ESCALAS` ENGINE = InnoDB;

CREATE TABLE `MST_SEGUIMIENTO` (
  `sg_id` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `sg_descripcion` varchar(60) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`sg_id`),
  UNIQUE KEY (sg_descripcion));
ALTER TABLE `crm`.`MST_SEGUIMIENTO` ENGINE = InnoDB;

CREATE TABLE `MST_SEGUIMIENTO_RES` (
  `sgr_id` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `sgr_descripcion` varchar(60) NOT NULL default '',
  `sgr_ref_seguimiento` tinyint UNSIGNED NOT NULL default '0',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`sgr_id`),
  UNIQUE KEY (sgr_descripcion));
ALTER TABLE `crm`.`MST_SEGUIMIENTO_RES` ENGINE = InnoDB;

CREATE TABLE `MST_DIAS_A_VENCER` (
  `dav_id` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `dav_dias` tinyint UNSIGNED NOT NULL default '0',
  `dav_datetime` datetime NOT NULL default '1999-01-01',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`dav_id`));
ALTER TABLE `crm`.`MST_DIAS_A_VENCER` ENGINE = InnoDB;

CREATE TABLE `MST_COSTO_OPERATIVO` (
  `cop_id` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `cop_costo` tinyint UNSIGNED NOT NULL default '0',
  `cop_datetime` datetime NOT NULL default '1999-01-01',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`cop_id`));
ALTER TABLE `crm`.`MST_COSTO_OPERATIVO` ENGINE = InnoDB;

CREATE TABLE `MST_TIPO_CONTACTO` (
  `tc_id` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `tc_descripcion` varchar(50) NOT NULL default '',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`tc_id`));
ALTER TABLE `crm`.`MST_TIPO_CONTACTO` ENGINE = InnoDB;


CREATE TABLE `MST_CLIENTE_CONTACTOS` (
  `clict_id` tinyint UNSIGNED NOT NULL AUTO_INCREMENT,
  `clict_codcliente` bigint UNSIGNED NOT NULL default '0',
  `clict_codcontacto` tinyint UNSIGNED NOT NULL default '0',
  `clict_tipocontacto` tinyint UNSIGNED NOT NULL default '0',
  `clict_titulo` tinyint UNSIGNED NOT NULL default '0',
  `clict_apynom` varchar(50) NOT NULL default '',
  `clict_departamento` varchar(50) NOT NULL default '',
  `clict_cargo` varchar(20) NOT NULL default '',
  `clict_telefono` varchar(20) NOT NULL default '',
  `clict_interno` varchar(20) NOT NULL default '',
  `clict_email` varchar(50) NOT NULL default '',
  `clict_fec_ult_contacto` datetime NOT NULL default '1999-01-01',
  `activo` char(1) NOT NULL default 'S',
  PRIMARY KEY  (`clict_id`),
  UNIQUE KEY (`clict_codcliente`, clict_codcontacto));
ALTER TABLE `crm`.`MST_CLIENTE_CONTACTOS` ENGINE = InnoDB;





CREATE TABLE `TX_TABLELOCK` (
  `tblk_nomtabla` varchar(40) NOT NULL default '',
  `tblk_codusuario` smallint UNSIGNED NOT NULL default '0');
ALTER TABLE `crm`.`TX_TABLELOCK` ENGINE = InnoDB;

CREATE TABLE `TX_PPTO` (
  `ppto_nroppto` mediumint UNSIGNED NOT NULL default '0',
  `ppto_codcliente` bigint UNSIGNED NOT NULL default '0',
  `ppto_cliente_obs` text default NULL,
  `ppto_fecinicio` date NOT NULL default '1999-01-01',
  `ppto_fecfin` date NOT NULL default '1999-01-01',
  `ppto_fecinst` datetime default NULL,
  `ppto_totpersonas` mediumint UNSIGNED NOT NULL default '0',
  `ppto_evt_nombre` varchar(50) NOT NULL default '',
  `ppto_evt_lugar` smallint UNSIGNED NOT NULL default '0',
  `ppto_evt_obs` text default NULL,
  `ppto_evt_tipo` tinyint UNSIGNED NOT NULL default '0',
  `ppto_evt_tipo_lugar` tinyint UNSIGNED NOT NULL default '0',
  `ppto_evt_uniforme` tinyint UNSIGNED NOT NULL default '0',
  `ppto_referencia` smallint UNSIGNED NOT NULL default '0',
  PRIMARY KEY  (`ppto_nroppto`));
ALTER TABLE `crm`.`TX_PPTO` ENGINE = InnoDB;

CREATE TABLE `TX_PPTO_SALAS` (
  `ppto_s_id` bigint UNSIGNED NOT NULL default '0',
  `ppto_s_nroppto` mediumint UNSIGNED NOT NULL default '0',
  `ppto_s_codlugsala` int UNSIGNED NOT NULL default '0',
  `ppto_s_fecinicio` date NOT NULL default '1999-01-01',
  `ppto_s_fecfin` date NOT NULL default '1999-01-01',
  `ppto_s_fecinst` datetime default NULL,
  `ppto_s_totpersonas` mediumint UNSIGNED NOT NULL default '0',
  `ppto_s_observaciones` text default NULL,
  PRIMARY KEY  (`ppto_s_id`),
  UNIQUE KEY (`ppto_s_nroppto`,`ppto_s_codlugsala`));
ALTER TABLE `crm`.`TX_PPTO_SALAS` ENGINE = InnoDB;

CREATE TABLE `TX_PPTO_SALAS_SERVICIOS` (
  `ppto_ss_id` bigint UNSIGNED NOT NULL default '0',
  `ppto_ss_pls` bigint UNSIGNED NOT NULL default '0',
  `ppto_ss_orden` tinyint UNSIGNED NOT NULL default '0',
  `ppto_ss_cantidad` mediumint UNSIGNED NOT NULL default '0',
  `ppto_ss_servicio` smallint UNSIGNED NOT NULL default '0',
  `ppto_ss_modalidad` tinyint UNSIGNED NOT NULL default '0',
  `ppto_ss_dias` smallint UNSIGNED NOT NULL default '0',
  `ppto_ss_preciolista` decimal(10,2) NOT NULL default '0',
  `ppto_ss_descuento` tinyint UNSIGNED NOT NULL default '0',
  `ppto_ss_preciodto` decimal(10,2) UNSIGNED NOT NULL default '0',
  PRIMARY KEY  (`ppto_ss_id`),
  UNIQUE KEY (`ppto_ss_pls`,`ppto_ss_orden`));
ALTER TABLE `crm`.`TX_PPTO_SALAS_SERVICIOS` ENGINE = InnoDB;

CREATE TABLE `TX_PPTO_SALAS_SERVICIOS_ACC` (
  `ppto_ssa_id` int UNSIGNED NOT NULL default '0',
  `ppto_ssa_plsa` bigint UNSIGNED NOT NULL default '0',
  `ppto_ssa_accesorio` smallint UNSIGNED NOT NULL default '0',
  PRIMARY KEY (`ppto_ssa_id`));
ALTER TABLE `crm`.`TX_PPTO_SALAS_SERVICIOS_ACC` ENGINE = InnoDB;

CREATE TABLE `TX_CAMBIO_ESTADO` (
  `chest_id` mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
  `chest_nroppto` mediumint UNSIGNED NOT NULL default '0',
  `chest_estado` tinyint UNSIGNED NOT NULL default '0',
  `chest_usuario` smallint UNSIGNED NOT NULL default '0',
  `chest_fecha` datetime  NOT NULL default '1999-01-01',
  PRIMARY KEY (`chest_id`));
ALTER TABLE `crm`.`TX_CAMBIO_ESTADO` ENGINE = InnoDB;

CREATE TABLE `TX_PPTO_EST_ACTUAL` (
  `estact_nroppto` mediumint UNSIGNED NOT NULL default '0',
  `estact_nuevo` bool NOT NULL default '0',
  `estact_actualizado` bool NOT NULL default '0',
  `estact_confirmado` bool NOT NULL default '0',
  `estact_cancelado` bool NOT NULL default '0',
  `estact_rechazado` bool NOT NULL default '0',
  `estact_os` bool NOT NULL default '0',
  `estact_of` bool NOT NULL default '0',
  `estact_facturado` bool NOT NULL default '0',
  `estact_cobrado` bool NOT NULL default '0',
  PRIMARY KEY (`estact_nroppto`));
ALTER TABLE `crm`.`TX_PPTO_EST_ACTUAL` ENGINE = InnoDB;



CREATE TABLE `TX_SEGUIMIENTO` (
  `seg_id` mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
  `seg_nroppto` mediumint UNSIGNED NOT NULL default '0',
  `seg_fechahora` datetime NOT NULL default '1999-01-01',
  `seg_usuario` smallint UNSIGNED NOT NULL default '0',
  `seg_item_seg` tinyint UNSIGNED NOT NULL default '0',
  `seg_item_res` tinyint UNSIGNED  NOT NULL default '0',
  `seg_observaciones` text NOT NULL default '',
  PRIMARY KEY (`seg_id`));
ALTER TABLE `crm`.`TX_SEGUIMIENTO` ENGINE = InnoDB;

CREATE TABLE `TX_VENDEDOR_PPTO` (
  `vp_nroppto` mediumint UNSIGNED NOT NULL default '0',
  `vp_vendedor` smallint UNSIGNED NOT NULL default '0',
  `vp_fec_creacion` datetime NOT NULL default '1999-01-01',
  PRIMARY KEY (`vp_nroppto`));
ALTER TABLE `crm`.`TX_VENDEDOR_PPTO` ENGINE = InnoDB;


alter table MST_CLIENTE add foreign key FK_CL_TITULO (cl_titulo) REFERENCES MST_TITULOS (tt_codtit);
alter table MST_CLIENTE add foreign key FK_CL_REFERENCIA (cl_referencia) REFERENCES MST_REFERENCIA (rf_codref);
alter table MST_CLIENTE add foreign key FK_CL_CODPOSTAL (domleg_cp) REFERENCES MST_CODIGOPOSTAL (cp_codpostal);
alter table MST_CLIENTE add foreign key FK_CL_LOCALIDAD (domleg_loc) REFERENCES MST_LOCALIDAD (lc_codlocalidad);
alter table MST_CLIENTE add foreign key FK_CL_PARTIDO (domleg_codpartido) REFERENCES MST_PARTIDO (pt_codpartido);
alter table MST_CLIENTE add foreign key FK_CL_PROVINCIA (domleg_codprovincia) REFERENCES MST_PROVINCIA (pv_codprovincia);
alter table MST_CLIENTE add foreign key FK_CL_PAIS (domleg_codpais) REFERENCES MST_PAIS (ps_codpais);
alter table MST_CLIENTE_FACT add foreign key FK_CF_CLIENTE (cf_codcliente) REFERENCES MST_CLIENTE (cl_codcliente);
alter table MST_CLIENTE_FACT add foreign key FK_CF_CODPOSTAL (cf_cp) REFERENCES MST_CODIGOPOSTAL (cp_codpostal);
alter table MST_CLIENTE_FACT add foreign key FK_CF_LOCALIDAD (cf_codpartido) REFERENCES MST_PARTIDO (pt_codpartido);
alter table MST_CLIENTE_FACT add foreign key FK_CF_PROVINCIA (cf_codprovincia) REFERENCES MST_PROVINCIA (pv_codprovincia);
alter table MST_CLIENTE_FACT add foreign key FK_CF_PAIS (cf_codpais) REFERENCES MST_PAIS (ps_codpais);
alter table MST_LOCALIDAD add foreign key FK_LC_CODPARTIDO (lc_codpartido) REFERENCES MST_PARTIDO (pt_codpartido);
alter table MST_PARTIDO add foreign key FK_PT_CODPROVINCIA (pt_codprovincia) REFERENCES MST_PROVINCIA (pv_codprovincia);
alter table MST_PROVINCIA add foreign key FK_PV_CODPAIS (pv_codpais) REFERENCES MST_PAIS (ps_codpais);
alter table MST_REFERENCIA add foreign key FK_RF_CODCOMI (rf_codcomi) REFERENCES MST_COMISIONES (cm_codcomi);
alter table MST_REFERENCIA add foreign key FK_RF_CATEGORIA (rf_categoria) REFERENCES MST_CATREF (cr_catref);
alter table MST_VENDEDORES add foreign key FK_VD_CATVEND (vd_categoria) REFERENCES MST_CATVEND (cv_catvend);
alter table MST1_VEND_USR add foreign key FK_VUS_VENDEDOR (vus_codvend) REFERENCES MST_VENDEDORES (vd_codvend);
alter table MST1_VEND_USR add foreign key FK_VUS_USUARIO (vus_codusuario) REFERENCES MST_USUARIOS (us_codusuario);
alter table MST_CODIGOPOSTAL add foreign key FK_CP_LOCALIDAD (cp_codlocalidad) REFERENCES MST_LOCALIDAD (lc_codlocalidad);
alter table MST_USUARIOS add foreign key FK_US_PERFIL (us_perfil) REFERENCES MST_PERFILES (pf_codperfil);
alter table MST_OPERADORES add foreign key FK_OP_MODALIDAD (modalidad_oper) REFERENCES MST_MODALIDAD_CONTRATACION (mc_codmodalidad);
alter table MST_ASISTENTES add foreign key FK_AS_MODALIDAD (modalidad_asist) REFERENCES MST_MODALIDAD_CONTRATACION (mc_codmodalidad);
alter table MST_EVT_LUGAR add foreign key FK_EL_CODPOSTAL (el_cp) REFERENCES MST_CODIGOPOSTAL (cp_codpostal);
alter table MST_EVT_LUGAR add foreign key FK_EL_LOCALIDAD (el_loc) REFERENCES MST_LOCALIDAD (lc_codlocalidad);
alter table MST_EVT_LUGAR add foreign key FK_EL_PARTIDO (el_codpartido) REFERENCES MST_PARTIDO (pt_codpartido);
alter table MST_EVT_LUGAR add foreign key FK_EL_PROVINCIA (el_codprovincia) REFERENCES MST_PROVINCIA (pv_codprovincia);
alter table MST_EVT_LUGAR add foreign key FK_EL_PAIS (el_codpais) REFERENCES MST_PAIS (ps_codpais);
alter table MST_PROVEEDORES add foreign key FK_PR_CODPOSTAL (pr_cp) REFERENCES MST_CODIGOPOSTAL (cp_codpostal);
alter table MST_PROVEEDORES add foreign key FK_PR_LOCALIDAD (pr_loc) REFERENCES MST_LOCALIDAD (lc_codlocalidad);
alter table MST_PROVEEDORES add foreign key FK_PR_PARTIDO (pr_codpartido) REFERENCES MST_PARTIDO (pt_codpartido);
alter table MST_PROVEEDORES add foreign key FK_PR_PROVINCIA (pr_codprovincia) REFERENCES MST_PROVINCIA (pv_codprovincia);
alter table MST_PROVEEDORES add foreign key FK_PR_PAIS (pr_codpais) REFERENCES MST_PAIS (ps_codpais);
alter table MST_SERVICIOS add foreign key FK_SE_FAMILIA (se_familia) REFERENCES MST_FAM_SERVICIOS (fs_codfamilia);
alter table MST_SERVICIOS add foreign key FK_SE_UNIDAD (se_unidad_negocio) REFERENCES MST_UNIDAD_NEGOCIO (un_codnegocio);
alter table MST_ACC_INSTALACION add foreign key FK_AI_FAMILIA_ACC (ai_codfamilia_acc) REFERENCES MST_FLIA_ACC_INST (fai_codfamilia);
alter table MST_ACC_INSTALACION add foreign key FK_AI_FAMILIA_SRV (ai_codfamilia_srv) REFERENCES MST_FAM_SERVICIOS (fs_codfamilia);
alter table MST_EVT_LUGAR_SALAS add foreign key FK_ELS_LUGAR (els_codlugar) REFERENCES MST_EVT_LUGAR (el_codlugar);
alter table MST_USR_ACCESOS add foreign key FK_UA_ACCESOS (ua_codacceso) REFERENCES MST_ACCESOS (ax_codacceso);
alter table MST_USR_ACCESOS add foreign key FK_UA_USUARIO (ua_codusuario) REFERENCES MST_USUARIOS (us_codusuario);
alter table MST_DTO_PRECIOS_DIAS add foreign key FK_DP_SERVICIO (dp_codservicio) REFERENCES MST_SERVICIOS (se_codservicio);
alter table MST_SERVICIOS_IDIOMA add foreign key FK_SI_SERVICIO (si_codservicio) REFERENCES MST_SERVICIOS (se_codservicio);
alter table MST_SERVICIOS_IDIOMA add foreign key FK_SI_IDIOMA (si_codidioma) REFERENCES MST_IDIOMAS (id_codidioma);
alter table MST_UNIDADES_COMERCIALES add foreign key FK_UC_SUPERVISOR (uc_codsupervisor) REFERENCES MST_VENDEDORES (vd_codvend);
alter table MST_UNIDADES_VENDEDORES add foreign key FK_UCV_UNIDAD (ucv_codunidad) REFERENCES MST_UNIDADES_COMERCIALES (uc_codunidad);
alter table MST_UNIDADES_VENDEDORES add foreign key FK_UCV_VENDEDOR (ucv_codvendedor) REFERENCES MST_VENDEDORES (vd_codvend);
alter table MST_UNIDADES_BONUS add foreign key FK_UCB_UNIDAD (ucb_codunidad) REFERENCES MST_UNIDADES_COMERCIALES (uc_codunidad);
alter table MST_UNIDADES_COMERCIALES add foreign key FK_UC_SUCURSAL (uc_codsucursal) REFERENCES MST_SUCURSALES (su_codsucursal);
alter table MST_COMISIONES add foreign key FK_CM_VENDEDOR (cm_codvend) REFERENCES MST_VENDEDORES (vd_codvend);
alter table MST_COMISIONES add foreign key FK_CM_MARCO (cm_marco_liquidacion) REFERENCES MST_MARCOS_LIQUIDACION (ml_codmarco);
alter table MST_UNIDADES_PRECIOS add foreign key FK_UP_UNIDAD (up_codunidad) REFERENCES MST_UNIDADES_COMERCIALES (uc_codunidad);
alter table MST_UNIDADES_PRECIOS add foreign key FK_UP_LISTA (up_codlista) REFERENCES MST_LISTAS_CUSTOM (lc_codlista);
alter table MST_GERENCIAS_COMERCIALES add foreign key FK_GC_SUPERVISOR (gc_codgerente) REFERENCES MST_VENDEDORES (vd_codvend);
alter table MST_GC_UNIDADES add foreign key FK_GCU_GERENCIA (gcu_codgerencia) REFERENCES MST_GERENCIAS_COMERCIALES (gc_codgerencia);
alter table MST_GC_UNIDADES add foreign key FK_GCU_UNIDAD (gcu_codunidad) REFERENCES MST_UNIDADES_COMERCIALES (uc_codunidad);
alter table MST_GC_ESCALAS add foreign key FK_GCE_GERENCIA (gce_codgerencia) REFERENCES MST_GERENCIAS_COMERCIALES (gc_codgerencia);
alter table MST_SEGUIMIENTO_RES add foreign key FK_SGR_ITEM (sgr_ref_seguimiento) REFERENCES MST_SEGUIMIENTO (sg_id);
alter table MST_CLIENTE_CONTACTOS add foreign key FK_CLICT_CLIENTE (clict_codcliente) REFERENCES MST_CLIENTE (cl_codcliente);
alter table MST_CLIENTE_CONTACTOS add foreign key FK_CLICT_TIPCONT (clict_tipocontacto) REFERENCES MST_TIPO_CONTACTO (tc_id);
alter table MST_CLIENTE_CONTACTOS add foreign key FK_CLICT_TITULO (clict_titulo) REFERENCES MST_TITULOS (tt_codtit);
alter table TX_TABLELOCK add foreign key FK_TBLK_USUARIO (tblk_codusuario) REFERENCES MST_USUARIOS (us_codusuario);
alter table TX_PPTO add foreign key FK_PPTO_CLIENTE (ppto_codcliente) REFERENCES MST_CLIENTE (cl_codcliente);
alter table TX_PPTO add foreign key FK_PPTO_EVTLUGAR (ppto_evt_lugar) REFERENCES MST_EVT_LUGAR (el_codlugar);
alter table TX_PPTO add foreign key FK_PPTO_EVTTIPO (ppto_evt_tipo) REFERENCES MST_EVT_TIPO (et_codtipo);
alter table TX_PPTO add foreign key FK_PPTO_EVTTIPOLG (ppto_evt_tipo_lugar) REFERENCES MST_EVT_TIPOLUGAR (etl_codtipo);
alter table TX_PPTO add foreign key FK_PPTO_UNIFORME (ppto_evt_uniforme) REFERENCES MST_EVT_UNIFORME (eu_codtipo);
alter table TX_PPTO add foreign key FK_PPTO_REFERENCIA (ppto_referencia) REFERENCES MST_REFERENCIA (rf_codref);
alter table TX_PPTO_SALAS add foreign key FK_S_PPTO (ppto_s_nroppto) REFERENCES TX_PPTO (ppto_nroppto);
alter table TX_PPTO_SALAS add foreign key FK_S_SALA (ppto_s_codlugsala) REFERENCES MST_EVT_LUGAR_SALAS (els_codlugsala);
alter table TX_PPTO_SALAS_SERVICIOS add foreign key FK_SS_PPTO_ID (ppto_ss_pls) REFERENCES TX_PPTO_SALAS (ppto_s_id);
alter table TX_PPTO_SALAS_SERVICIOS add foreign key FK_SS_SERVICIO (ppto_ss_servicio) REFERENCES MST_SERVICIOS (se_codservicio);
alter table TX_PPTO_SALAS_SERVICIOS add foreign key FK_SS_MODALIDAD (ppto_ss_modalidad) REFERENCES MST_MODALIDAD_CONTRATACION (mc_codmodalidad);
alter table TX_PPTO_SALAS_SERVICIOS_ACC add foreign key FK_SSA_PPTO_ID (ppto_ssa_plsa) REFERENCES TX_PPTO_SALAS_SERVICIOS (ppto_ss_id);
alter table TX_PPTO_SALAS_SERVICIOS_ACC add foreign key FK_SSA_ACCESORIO (ppto_ssa_accesorio) REFERENCES MST_ACC_INSTALACION (ai_codacc);
alter table TX_CAMBIO_ESTADO add foreign key FK_CHEST_PPTO (chest_nroppto) REFERENCES TX_PPTO (ppto_nroppto);
alter table TX_CAMBIO_ESTADO add foreign key FK_CHEST_NEW (chest_estado) REFERENCES MST_ESTADO_EVENTO (eev_codestado);
alter table TX_CAMBIO_ESTADO add foreign key FK_CHEST_USUARIO (chest_usuario) REFERENCES MST_USUARIOS (us_codusuario);
alter table TX_SEGUIMIENTO add foreign key FK_SEG_PPTO (seg_nroppto) REFERENCES TX_PPTO (ppto_nroppto);
alter table TX_SEGUIMIENTO add foreign key FK_SEG_USUARIO (seg_usuario) REFERENCES MST_USUARIOS (us_codusuario);
alter table TX_SEGUIMIENTO add foreign key FK_SEG_SEGUIM (seg_item_seg) REFERENCES MST_SEGUIMIENTO (sg_id);
alter table TX_SEGUIMIENTO add foreign key FK_SEG_SEGUIM_RES (seg_item_res) REFERENCES MST_SEGUIMIENTO_RES (sgr_id);
alter table TX_VENDEDOR_PPTO add foreign key FK_VP_PPTO (vp_nroppto) REFERENCES TX_PPTO (ppto_nroppto);
alter table TX_VENDEDOR_PPTO add foreign key FK_VP_VENDEDOR (vp_vendedor) REFERENCES MST_VENDEDORES (vd_codvend);
alter table TX_PPTO_EST_ACTUAL add foreign key FK_ESTACT_PPTO (estact_nroppto) REFERENCES TX_PPTO (ppto_nroppto);

CREATE VIEW VW_SERVICIOS_IDIOMA as (SELECT a.se_codservicio, b.si_descripcion_abreviada from MST_SERVICIOS a,
MST_SERVICIOS_IDIOMA b WHERE a.se_codservicio = b.si_codservicio);

CREATE VIEW VW_PPTO_ESTADO AS
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'PENDIENTE' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_nuevo <> 0 AND
EST.estact_actualizado = 0 AND
EST.estact_confirmado = 0 AND
EST.estact_cancelado = 0 AND
EST.estact_rechazado = 0 AND
EST.estact_os = 0 AND
EST.estact_of = 0 AND
EST.estact_facturado = 0 AND
EST.estact_cobrado = 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'PENDIENTE' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_nuevo = 0 AND
EST.estact_actualizado <> 0 AND
EST.estact_confirmado = 0 AND
EST.estact_cancelado = 0 AND
EST.estact_rechazado = 0 AND
EST.estact_os = 0 AND
EST.estact_of = 0 AND
EST.estact_facturado = 0 AND
EST.estact_cobrado = 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'CONFIRMADO' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_nuevo <> 0 AND
EST.estact_actualizado = 0 AND
EST.estact_confirmado <> 0 AND
EST.estact_cancelado = 0 AND
EST.estact_rechazado = 0 AND
EST.estact_os = 0 AND
EST.estact_of = 0 AND
EST.estact_facturado = 0 AND
EST.estact_cobrado = 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'CONFIRMADO' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_nuevo = 0 AND
EST.estact_actualizado <> 0 AND
EST.estact_confirmado <> 0 AND
EST.estact_cancelado = 0 AND
EST.estact_rechazado = 0 AND
EST.estact_os = 0 AND
EST.estact_of = 0 AND
EST.estact_facturado = 0 AND
EST.estact_cobrado = 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'CANCELADO' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_cancelado <> 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'RECHAZADO' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_rechazado <> 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'ORDEN DE SERVICIO' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_os <> 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'ORDEN DE FACTURACION' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_of <> 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'FACTURADO' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_facturado <> 0
GROUP BY VEN.vp_vendedor, ESTADO)
UNION ALL
(SELECT SUM(PPSS.ppto_ss_preciodto) TOTFACT,
COUNT(DISTINCT PRE.ppto_nroppto) CANTIDAD,
VEN.vp_vendedor VENDEDOR,
MONTH(PRE.ppto_fecinicio) MES,
YEAR(PRE.ppto_fecinicio) ANIO,
'COBRADO' ESTADO
FROM
TX_PPTO PRE,
TX_PPTO_EST_ACTUAL EST,
TX_VENDEDOR_PPTO VEN,
TX_PPTO_SALAS PPS,
TX_PPTO_SALAS_SERVICIOS PPSS
WHERE
PRE.ppto_nroppto = EST.estact_nroppto AND
PRE.ppto_nroppto = VEN.vp_nroppto AND
PRE.ppto_nroppto = PPS.ppto_s_nroppto AND
PPS.ppto_s_id = PPSS.ppto_ss_pls AND
EST.estact_cobrado <> 0
GROUP BY VEN.vp_vendedor, ESTADO);