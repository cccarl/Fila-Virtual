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
                        <div>
                            <div>
                                <button class="botonJ">Descargar QR</button>
                            </div>
                            <div>
                                <button class="botonJ">Ingresar a la fila</button>
                            </div>
                            <div>
                                <router-link to="/fila">
                                    <button class="botonJ">Ver Fila</button>
                                </router-link>
                            </div>
                        </div>
                    </div>
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
    .boton:active{
        
    }
</style>