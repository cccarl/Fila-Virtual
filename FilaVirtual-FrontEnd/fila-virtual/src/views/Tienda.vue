<template>
    <div>
        <div class = "tienda">
            <Header msgBoton1="Ingresar" msgBoton2="Registrarse"/>
        </div>
        
            <div class= "w3-row" id= "cuadroGrande">
                <div>
                    <div id= "cuadroChicoTienda">
                        <h2>Información de la tienda</h2>
                        <p>
                            Fruna<br>
                            Calle falsa 123<br>
                            Tienda de confites<br>
                            +569 12345678
                        </p>
                    </div>
                </div>
                <div>
                    <div id= "cuadroChicoFila">
                        <h2>Fila</h2>
                        <p>
                            Cantidad de personas: 0<br>
                            Tiempo estimado: 24:00:00<br>
                        </p>
                        <div class="container">
                            <div class="grid-item">
                                <button class="botonJ">Descargar QR</button>
                            </div>
                            <div class="grid-item">
                                <button v-on:click="showPopUp" class="botonJ-popup">Ingresar a la fila</button>
                            </div>
                            <div class="grid-item">
                                <router-link to="/fila">
                                    <button class="botonJ">Ver Fila</button>
                                </router-link>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="prueba" class="overlay">
                <div class="popup">
                    <form>
                        <h1 class="titleRegister">Ingresa a la fila</h1>
                        <input placeholder="Nombre" type="name" />
                        <input placeholder="Apellido" type="lastName" />
                        <input placeholder="Telefono" type="phone" />
                            <button v-on:click="ingresarVue" class="btn btnRigth">Aceptar</button>
                            <button v-on:click="closePopUp" class="btn btnRigth" id="botonCerrarPopup">Cancelar</button>
                    </form>
                </div>
            </div>
    </div>
</template>

<script>
    import Header from "@/components/Header.vue";
    export default {
        name: "Register",
        components: {
            Header,
        },
        methods: {
            showPopUp() {
                var btn = document.getElementById("prueba");
                btn.style.visibility = 'visible';
            },
            closePopUp(){
                var btn = document.getElementById("prueba");
                btn.style.visibility = 'hidden';
            },
            ingresarVue(){
                var btn = document.getElementById("prueba");
                btn.style.visibility = 'hidden';
                alert('Se ha ingresado a la fila correctamente, le llegara la confirmación a su celular');
            }
        }
    };

    
    
</script>

<style>
    #cuadroGrande{
        background: #f1faee;
        border-radius: 6px;
        padding: 40px;
        width: 80%;
        margin: 50px auto;
        box-shadow: 15px 15px 10px rgba(0, 0, 0, 0.1);
        overflow: hidden;
    }
    #cuadroChicoTienda{
        background: #a8dadc;
        border-radius: 4px;
        padding: 10px;
        width: 46%;
        margin: left;
        float: left;
    }
    #cuadroChicoFila{
        background: #a8dadc;
        border-radius: 4px;
        padding: 10px;
        width: 46%;
        margin: right;
        float: right;
    }
    .botonJ {
        width: 100px;
        padding: 15px;
        margin: 5px;
        float: right;
        border-radius: 6px;
        border: 0;
        border: 2px solid #6da1b6;
        background: #bcd4d5;
        font-size: 15px;
        text-align: center;
        color: #2c4766;
        text-shadow: 1px 1px 0px rgba(0, 0, 0, 0.1);
    }
    .botonJ:active{
        background: #93cacc;
    }
    
    .botonJ-popup {
        width: 100px;
        padding: 15px;
        margin: 5px;
        float: right;
        border-radius: 6px;
        border: 0;
        border: 2px solid #6da1b6;
        background: #bcd4d5;
        font-size: 15px;
        text-align: center;
        color: #2c4766;
        text-shadow: 1px 1px 0px rgba(0, 0, 0, 0.1);
    }
    .botonJ-popup:active{
        background: #93cacc;
    }

    .container{
        display: grid;
        grid-template-columns: auto;
    }

    .grid-item{
        float: right;
    }

    /*
        POPUP FORMULARIO EMERGENTE
    */
    input {
        width: 90%;
        background: #ffffff;
        border: solid #6da1b6;
        padding: 20px;
        border-radius: 6px;
        margin-bottom: 10px;
        border: 1px solid #eee;
        font-size: 20px;
    }
    .btn {
        width: 150px;
        padding: 25px;
        margin: 5px;
        float: right;
        border-radius: 6px;
        border: 0;
        border: 2px solid #6da1b6;
        background: #bcd4d5;
        font-size: 20px;
        text-align: center;
        color: #2c4766;
        text-shadow: 1px 1px 0px rgba(0, 0, 0, 0.1);
    }
    .btn:active {
        background: #93cacc;
    }

    .btnRigth {
        float: right;
    }
    .overlay{
        background: rgba(0, 0, 0, 0.3);
        position: fixed;
        top: 0;
        bottom: 0;
        left: 0;
        right: 0;
        display: flex;
        align-items: center;
        justify-content: center;
        visibility: hidden;
    }
    .popup{
        background: #f1faee;
        border-radius: 5px;
        width: 70%;
        padding: 15px;
        margin: 20px;
    }
</style>