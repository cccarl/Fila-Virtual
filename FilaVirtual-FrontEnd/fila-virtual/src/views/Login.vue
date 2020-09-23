<template>
    <div class = "container">
        <div class = "login">
            <Header msgBoton1="Ingresar" msgBoton2="Registrarse"/>
        </div>
        <div id="cuadroGrande">
            <form>
                <h1 class="titleRegister">Ingresa a tu cuenta</h1>
                <input placeholder="Email" type="email" />
                <input placeholder="Contraseña" type="password" />

                <router-link to="/tienda">
                    <button class="btn btnRigth">Aceptar</button>
                </router-link>

                <router-link to="/">
                    <button class="btn btnRigth">Cancelar</button>
                </router-link>

            </form>
        </div>
    </div>
</template>

<script>
    import Header from "@/components/Header.vue";
    export default {
        name: "Login",
        components: {
            Header,
        },
    };
</script>

<style>
    #cuadroGrande{   
        background: #f1faee;
        border-radius: 6px;
        padding: 10px;
        padding-top: 30px;
        width: 80%;
        margin: 50px auto;
        box-shadow: 15px 15px 10px rgba(0, 0, 0, 0.1);
        overflow: hidden;
    }
    input {
        width: 90%;
        background: #ffffff;
        border: 0;
        padding: 20px;
        border-radius: 6px;
        margin-bottom: 10px;
        border: 1px solid #eee;
    }
    .btn {
        width: 200px;
        padding: 15px;
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
</style>