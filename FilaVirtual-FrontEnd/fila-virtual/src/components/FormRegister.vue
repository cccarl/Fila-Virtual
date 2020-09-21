<template>
  <div class="formRegister">
    <div>
      <form>
        <h1 class="titleRegister">Crear una cuenta</h1>
        <input placeholder="Nombre" type="text" />
        <input placeholder="Apellido" type="text" />
        <input placeholder="Email" type="email" />
        <input placeholder="Número de celular" type="text" />
        <input placeholder="Contraseña" type="password" />
        <input placeholder="Confirmación de contraseña" type="password" />

        <router-link to="/successregister">
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
export default {
  name: "FormRegister",
  props: {},
};
</script>

<style>
form {
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
  position: static;
  width: 200px;
  padding: 20px;
  margin: 5px;
  border-radius: 6px;
  border: 0;
  border: 2px solid #af4d49;
  background: #f26964;
  font-size: 1.2em;
  color: #fff;
  text-shadow: 1px 1px 0px rgba(0, 0, 0, 0.1);
}
.btn:active {
  background: #af4d49;
}

.btnRigth {
  float: right;
}

.titleRegister {
  margin: 0px 0px 30px 0px;
}

article,
aside,
details,
figcaption,
figure,
footer,
header,
hgroup,
nav,
section {
  display: block;
}

input:focus,
textarea:focus {
  outline: none;
}

label,
select,
button,
input[type="submit"],
input[type="radio"],
input[type="checkbox"] input[type="button"] {
  cursor: pointer;
}

* {
  margin: 0;
  padding: 0;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}

* {
  font-family: "Helvetica Neue", Helvetica, Arial;
}
</style>