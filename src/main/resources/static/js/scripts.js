/*!
* Start Bootstrap - Freelancer v7.0.6 (https://startbootstrap.com/theme/freelancer)
* Copyright 2013-2022 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-freelancer/blob/master/LICENSE)
*/
//
// Scripts
// 

/*window.addEventListener('DOMContentLoaded', event => {

    // Navbar shrink function
    var navbarShrink = function () {
        const navbarCollapsible = document.body.querySelector('#mainNav');
        if (!navbarCollapsible) {
            return;
        }
        if (window.scrollY === 0) {
            navbarCollapsible.classList.remove('navbar-shrink')
        } else {
            navbarCollapsible.classList.add('navbar-shrink')
        }

    };

    // Shrink the navbar 
    navbarShrink();

    // Shrink the navbar when page is scrolled
    document.addEventListener('scroll', navbarShrink);

    // Activate Bootstrap scrollspy on the main nav element
    const mainNav = document.body.querySelector('#mainNav');
    if (mainNav) {
        new bootstrap.ScrollSpy(document.body, {
            target: '#mainNav',
            offset: 72,
        });
    };

    // Collapse responsive navbar when toggler is visible
    const navbarToggler = document.body.querySelector('.navbar-toggler');
    const responsiveNavItems = [].slice.call(
        document.querySelectorAll('#navbarResponsive .nav-link')
    );
    responsiveNavItems.map(function (responsiveNavItem) {
        responsiveNavItem.addEventListener('click', () => {
            if (window.getComputedStyle(navbarToggler).display !== 'none') {
                navbarToggler.click();
            }
        });
    });

    
});*/

//validar de formulario agendarcita (paciente)
if(document.getElementById('agendarcita')){
const agendarcita = document.getElementById('agendarcita');/*id="agendarcita"*/ 
const especialidad = document.getElementById('especialidad');
const selectmedic = document.getElementById('selectmedic');
const fechacita = document.getElementById('fechacita');
const horacita = document.getElementById('horacita'); 

agendarcita.addEventListener('submit',function (e){/* aca validamos si los campo dentro de los inout estas vacios */ 
    e.preventDefault(); 
   if((especialidad.value.length > 0) && (selectmedic.value.length > 0) && (fechacita.value.length > 0) && (horacita.value.length > 0)){
        /*agendarcita.submit();*/        
        console.log("Enviando formulario .....");
    }else{
        console.log("Error Enviando formulario .....");
    }
})
}
//validar de formulario cancelarcita (paciente)
if(document.getElementById('cancelarcita')){
const cancelarcita = document.getElementById('cancelarcita');
const cancelspecialty = document.getElementById('cancelspecialty');
const canceltipedocument = document.getElementById('canceltipedocument');
const cancelfechacita = document.getElementById('cancelfechacita');
const cancelhoracita = document.getElementById('cancelhoracita');   
cancelarcita.addEventListener('submit',function (e){
    e.preventDefault(); 
   if((cancelspecialty.value.length > 0) && (canceltipedocument.value.length > 0) && (cancelfechacita.value.length > 0) && (cancelhoracita.value.length > 0)){
        /*cancelarcita.submit();*/        
        console.log("Enviando formulario .....");
    }else{
        console.log("Error Enviando formulario .....");
    }
})
}
//validar de formulario historialcita (paciente)
if(document.getElementById('historialcita')){
const historialcita = document.getElementById('historialcita');
const histotyfechacita = document.getElementById('histotyfechacita');

historialcita.addEventListener('submit',function (e){
    e.preventDefault(); 
   if((histotyfechacita.value.length > 0)){
        /*historialcita.submit();*/        
        console.log("Enviando formulario .....");
    }else{
        console.log("Error Enviando formulario .....");
    }
})
}
//validar de formulrio login
if(document.getElementById('loginnn')){
const login = document.getElementById('loginnn');
const usuario = document.getElementById('usuario');
const contrasena = document.getElementById('contrasena');

login.addEventListener('submit',function (e){
    e.preventDefault(); 
   if((usuario.value.length > 0)&& (contrasena.value.length > 0)){
        /*login.submit(); */      
        console.log("Enviando formulario .....");
    }else{
        console.log("Error Enviando formulario .....");
    }
})
}
//validar de formulrio admin registrar paciente
if(document.getElementById('registerpatient')){
    const registerpatient = document.getElementById('registerpatient');
    const rpnombre = document.getElementById('rpnombre');
    const rptipodocumentos = document.getElementById('rptipodocumentos');
    const rpfechanacimiento = document.getElementById('rpfechanacimiento');
    const rpnumerocelular = document.getElementById('rpnumerocelular');
    const rpuserpaciente = document.getElementById('rpuserpaciente');
    const rpapellido = document.getElementById('rpapellido');
    const rpNundoc = document.getElementById('rpNundoc');
    const rpedad = document.getElementById('rpedad');
    const rptipogenero = document.getElementById('rptipogenero');
    const rppasspasiente = document.getElementById('rppasspasiente');
    const rpemail = document.getElementById('rpemail');
    
    registerpatient.addEventListener('submit',function (e){
        e.preventDefault(); 
       if((rpnombre.value.length > 0) && (rptipodocumentos.value.length > 0) 
       && (rpfechanacimiento.value.length > 0) && (rpnumerocelular.value.length > 0) 
       && (rpuserpaciente.value.length > 0) && (rpapellido.value.length > 0)
       && (rpNundoc.value.length > 0) && (rpedad.value.length > 0)
       && (rptipogenero.value.length > 0) && (rppasspasiente.value.length > 0)
       && (rpemail.value.length > 0)){
            registerpatient.submit();      
            console.log("Enviando formulario .....");
        }else{
            console.log("Error Enviando formulario .....");
        }
    })
}
//validar de formulrio admin modificar paciente
if(document.getElementById('modifpatient')){
    const modifpatient = document.getElementById('modifpatient');
    const mpnombre = document.getElementById('mpnombre');
    const mptipodocumentos = document.getElementById('mptipodocumentos');
    const mpfechanacimiento = document.getElementById('mpfechanacimiento');
    const mpnumerocelular = document.getElementById('mpnumerocelular');
    const mpuserpaciente = document.getElementById('mpuserpaciente');
    const mpapellido = document.getElementById('mpapellido');
    const mpNundoc = document.getElementById('mpNundoc');
    const mpedad = document.getElementById('mpedad');
    const mptipogenero = document.getElementById('mptipogenero');
    const mppasspasiente = document.getElementById('mppasspasiente');
    const mpemail = document.getElementById('mpemail');
    
    modifpatient.addEventListener('submit',function (e){
        e.preventDefault(); 
       if((mpnombre.value.length > 0) && (mptipodocumentos.value.length > 0) 
       && (mpfechanacimiento.value.length > 0) && (mpnumerocelular.value.length > 0) 
       && (mpuserpaciente.value.length > 0) && (mpapellido.value.length > 0)
       && (mpNundoc.value.length > 0) && (mpedad.value.length > 0)
       && (mptipogenero.value.length > 0) && (mppasspasiente.value.length > 0)
       && (mpemail.value.length > 0)){
            /*registerpatien.submit(); */      
            console.log("Enviando formulario .....");
        }else{
            console.log("Error Enviando formulario .....");
        }
    })
}

//validar de formulrio regConsultorio_agre
if(document.getElementById('regConsultorio_agre')){
    const regConsultorio_agre = document.getElementById('regConsultorio_agre');
    const url = 'http://localhost:8080/api/consultorio/';
    const nombrecons = document.getElementById('nombrecons');//nombre
    const ubicacons = document.getElementById('ubicacons');//ubicacion
    const especialidad2 = document.getElementById('especialidad2');//id_especialidad
    

    regConsultorio_agre.addEventListener('submit',function (e){
        e.preventDefault(); 
        if((nombrecons.value.length > 0) && (ubicacons.value.length > 0) && (especialidad2.value.length > 0)){
                /*regConsultorio_agre.submit();*/ 
                let consultorio = {				
				nombre:nombrecons.value,
				ubicacion:ubicacons.value,
				id_especialidad:especialidad2.value,
			    }
			    // se configura la cabecera de la peticion para establecer el formato de envio y el cuerpo con los datos a enviar
			    let headers = {
			            method: 'POST',
			            headers: {
			            accept: 'application.json',
			              'Content-Type': 'application/json'
			            },
			            body: JSON.stringify(consultorio),
			          }
			          // se envia la peticion usando fetch
			    fetch(url+'agregar',headers)
			    .then(resp=>{
			        // se maneja la respuesta y se devuelve un mensaje a la vista
			        if(resp.ok){
			            alert("La especialidad ha sido agregada");
			        }else{
			            alert("Ha ocurrio algun error");
			        }
			    })  
                       
                console.log("Enviando formulario .....");
            }else{
                console.log("Error Enviando formulario .....");
            }
        })
}

//validar de formulrio regConsul_modif
if(document.getElementById('regConsul_modif')){
    const regConsul_modif = document.getElementById('regConsul_modif');
    const nombrecons2 = document.getElementById('nombrecons2');
    const ubicacons2 = document.getElementById('ubicacons2');
    const especialidad3 = document.getElementById('especialidad3');    

    regConsul_modif.addEventListener('submit',function (e){
        e.preventDefault(); 
        if((nombrecons2.value.length > 0) && (ubicacons2.value.length > 0) && (especialidad3.value.length > 0)){
                /*regConsul_modif.submit();*/
                let consultorio = {				
				nombre:nombrecons2.value,
				ubicacion:ubicacons2.value,
				id_especialidad:especialidad3.value,
			    }
			    // se configura la cabecera de la peticion para establecer el formato de envio y el cuerpo con los datos a enviar
			    let headers = {
			            method: 'PUT',
			            headers: {
			            accept: 'application.json',
			              'Content-Type': 'application/json'
			            },
			            body: JSON.stringify(consultorio),
			          }
			          // se envia la peticion usando fetch
			    fetch(url+'agregar',headers)
			    .then(resp=>{
			        // se maneja la respuesta y se devuelve un mensaje a la vista
			        if(resp.ok){
			            alert("La especialidad ha sido agregada");
			        }else{
			            alert("Ha ocurrio algun error");
			        }
			    })  
                                                        
                console.log("Enviando formulario .....");
            }else{
                console.log("Error Enviando formulario .....");
            }
        })
}

//validar de formulrio regMedico_agre
if(document.getElementById('regMedico_agre')){
    const regMedico_agre = document.getElementById('regMedico_agre');
    const url = 'http://localhost:8080/api/medico/';
    const asigconsultorioMedico = document.getElementById('asigconsultorio');//id_consultorio
    const usermedico = document.getElementById('usermedico');//usermedic    
    const tipodocumentosMedico = document.getElementById('tipodocumentos');//tipodocumento
    const fechanacimientoMedico = document.getElementById('fechanacimiento');//fechanacimiento
    const edadMedico = document.getElementById('edad');//edad
    const tipogeneroMedico = document.getElementById('tipogenero');//genero
    const numerocelularMed = document.getElementById('numerocelular');//celular
    const especialidadMedico = document.getElementById('especialidad');//id_especialidad    
    const apellidoMedico = document.getElementById('apellido');//apellidos
    const nombreMedico = document.getElementById('nombre');//nombres       
    const emailMedico = document.getElementById('email');//email    
    const passmedico = document.getElementById('passmedico');//password

    regMedico_agre.addEventListener('submit',function (e){
        e.preventDefault(); 
        if((nombreMedico.value.length > 0) && (tipodocumentosMedico.value.length > 0) && (fechanacimientoMedico.value.length > 0) 
        && (numerocelularMed.value.length > 0) && (especialidadMedico.value.length > 0) && (usermedico.value.length > 0) 
        && (apellidoMedico.value.length > 0) && (edadMedico.value.length > 0) && (tipogeneroMedico.value.length > 0) 
        && (emailMedico.value.length > 0) && (asigconsultorioMedico.value.length > 0) && (passmedico.value.length > 0)){
                /*regMedico_agre.submit();*/
                let medico = {
				id_consultorio:asigconsultorioMedico.value,
				usermedic:usermedico.value,
				tipodocumento:tipodocumentosMedico.value,
				fechanacimiento:fechanacimientoMedico.value,
				edad:edadMedico.value,
		        genero:tipogeneroMedico.value,
				celular:numerocelularMed.value,       
		       	id_especialidad:especialidadMedico.value,		        
		        apellidos:apellidoMedico.value,
		        nombres:nombreMedico.value,		        
		        email:emailMedico.value,		        
		        password:passmedico.value,
			    }
			    // se configura la cabecera de la peticion para establecer el formato de envio y el cuerpo con los datos a enviar
			    let headers = {
			            method: 'POST',
			            headers: {
			            accept: 'application.json',
			              'Content-Type': 'application/json'
			            },
			            body: JSON.stringify(medico),
			          }
			          // se envia la peticion usando fetch
			    fetch(url+'agregar',headers)
			    .then(resp=>{
			        // se maneja la respuesta y se devuelve un mensaje a la vista
			        if(resp.ok){
			            alert("La especialidad ha sido agregada");
			        }else{
			            alert("Ha ocurrio algun error");
			        }
			    })  
                        
                console.log("Enviando formulario .....");
            }else{
                console.log("Error Enviando formulario .....");
            }
        })
}

//validar de formulrio regMedico_modif
if(document.getElementById('regMedico_modif')){	
    const regMedico_modif = document.getElementById('regMedico_modif');
   
    const nombreMedico2 = document.getElementById('nombre');
    const tipodocumentosMedico2 = document.getElementById('tipodocumentos');
    const fechanacimientoMedico2 = document.getElementById('fechanacimiento');
    const numerocelularMed2 = document.getElementById('numerocelular');
    const especialidadMedico2 = document.getElementById('especialidad');
    const usermedico2 = document.getElementById('usermedico');
    const apellidoMedico2 = document.getElementById('apellido');
    const edadMedico2 = document.getElementById('edad');
    const tipogeneroMedico2 = document.getElementById('tipogenero');   
    const emailMedico2 = document.getElementById('email');
    const asigconsultorioMedico2 = document.getElementById('asigconsultorio');
    const passmedico2 = document.getElementById('passmedico2');

    regMedico_modif.addEventListener('submit',function (e){
        e.preventDefault(); 
        if((nombreMedico2.value.length > 0) && (tipodocumentosMedico2.value.length > 0) && (fechanacimientoMedico2.value.length > 0) 
        && (numerocelularMed2.value.length > 0) && (especialidadMedico2.value.length > 0) && (usermedico2.value.length > 0) 
        && (apellidoMedico2.value.length > 0) && (edadMedico2.value.length > 0) && (tipogeneroMedico2.value.length > 0) 
        && (emailMedico2.value.length > 0) && (asigconsultorioMedico2.value.length > 0) && (passmedico2.value.length > 0)){
                /*regMedico_modif.submit();*/ 
                console.log("Enviando formulario .....");
            }else{
                console.log("Error Enviando formulario .....");
            }
        })
}

//validacion de formulrio horario de atencion (medico)
if(document.getElementById('officehours')){
	
    const officehours = document.getElementById('officehours')    
    const attentiondate = document.getElementById('attentiondate');
    const horainicio = document.getElementById('horainicio');
    const horafin = document.getElementById('horafin');

    officehours.addEventListener('submit',function (e){
        e.preventDefault(); 
        if((attentiondate.value.length > 0) && (horainicio.value.length > 0) && (horafin.value.length > 0)){
                /*officehours.submit();*/                    
                console.log("Enviando formulario .....");
            }else{
                console.log("Error Enviando formulario .....");
            }
        })
}

//validacion de formulario pedir historia clinica (medico)
if(document.getElementById('pedirhistoclinica')){
    const pedirhistoclinica = document.getElementById('pedirhistoclinica');
    const nombrepedirhc = document.getElementById('nombrepedirhc');
    const nundocpedirhc = document.getElementById('nundocpedirhc');
    
    pedirhistoclinica.addEventListener('submit',function (e){
        e.preventDefault();         
        if((nombrepedirhc.value.length > 0) && (nundocpedirhc.value.length > 0) ){
                /*pedirhistoclinica.submit();*/        
                console.log("Enviando formulario .....");
            }else{
                console.log("Error Enviando formulario .....");
            }
        })
}

//validacion de formulario ver citas medicas (medico)
if(document.getElementById('vercitasmedi')){
    const vercitasmedi = document.getElementById('vercitasmedi');
    const fechavercita = document.getElementById('fechavercita');
   
    vercitasmedi.addEventListener('submit',function (e){
        e.preventDefault();        
        if((fechavercita.value.length > 0) ){
                vercitasmedi.submit();        
                console.log("Enviando formulario .....");
            }else{
                console.log("Error Enviando formulario .....");
            }
        })
}

//validacion de formulario ver historia clinica (medico)
    if(document.getElementById('verhistoclinica')){        
    const verhistoclinica = document.getElementById('verhistoclinica');
    const nombreverhc = document.getElementById('nombreverhc');
    const tipodocverhc = document.getElementById('tipodocverhc');
    const fechanacverhc = document.getElementById('fechanacverhc');
    const celularverhc = document.getElementById('celularverhc');
    const comentarioverhc = document.getElementById('comentarioverhc');
    const apellidoverhc = document.getElementById('apellidoverhc');
    const nundocverhc = document.getElementById('nundocverhc');
    const edadverhc = document.getElementById('edadverhc');
    const generoverhc = document.getElementById('generoverhc');
    const antecefamverhc = document.getElementById('antecefamverhc');
    const emailverhc = document.getElementById('emailverhc');

    verhistoclinica.addEventListener('submit',function (e){
        e.preventDefault(); 
        if((nombreverhc.value.length > 0) && (tipodocverhc.value.length > 0) && 
            (fechanacverhc.value.length > 0) && (celularverhc.value.length > 0) &&
            (comentarioverhc.value.length > 0) && (apellidoverhc.value.length > 0) &&
            (nundocverhc.value.length > 0) && (edadverhc.value.length > 0) &&
            (generoverhc.value.length > 0) && (antecefamverhc.value.length > 0) &&
            (emailverhc.value.length > 0) ){
                /*verhistoclinica.submit();*/        
                console.log("Enviando formulario .....");
            }else{
                console.log("Error Enviando formulario .....");
            }
        })
}



