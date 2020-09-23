<template>
  <div class="filaComponent">
    <div class="titleFila">
      <h1>Fila del local</h1>
    </div>

    <button class="btnVerLocal btnViewQueue">Avanzar fila</button>

    <table style="width:100%">
      <tr>
        <th>#</th>
        <th>Nombre</th>
        <th>Celular</th>
      </tr>
      <tr>
        <td>1</td>
        <td>Gabriel</td>
        <td>11111111111</td>
      </tr>
      <tr>
        <td>2</td>
        <td>Carlos</td>
        <td>11111111111</td>
      </tr>
      <tr>
        <td>3</td>
        <td>Manuel</td>
        <td>11111111111</td>
      </tr>
      <tr>
        <td>4</td>
        <td>William</td>
        <td>11111111111</td>
      </tr>
      <tr>
        <td>5</td>
        <td>Jose</td>
        <td>11111111111</td>
      </tr>
    </table>
    <router-link to="/tienda">
      <button class="btnVerLocal btnViewQueue">Ver local</button>
    </router-link>
    <button class="btnCerrar btnViewQueue">Cerrar fila</button>
  </div>
</template>

<script>
export default {
  name: "FilaComponent",
  props: {},
};
</script>

<style>
.filaComponent {
  background: #f1faee;
  border-radius: 6px;
  padding: 40px;
  width: 80%;
  margin: 50px auto;
  box-shadow: 15px 15px 10px rgba(0, 0, 0, 0.1);
  overflow: hidden;
}
table,
th,
td {
  border: 1px solid black;
  border-collapse: collapse;
  padding: 15px;
  background-color: #ffffff;
}

.titleFila {
  background-color: #acdde6;
  padding: 10px;
  margin-bottom: 30px;
  border: 1px solid #000000;
}

.btnViewQueue {
  position: static;
  width: 150px;
  padding: 10px;
  margin: 20px;
  border-radius: 6px;
  font-size: 1.2em;
  color: #000;
  text-shadow: 1px 1px 0px rgba(0, 0, 0, 0.1);
  float: left;
}

.btnVerLocal {
  border: 2px solid #88b3bb;
  background: #acdde6;
}
.btnVerLocal:active {
  background: #88b3bb;
}

.btnCerrar {
  border: 2px solid #af4d49;
  background: #f26964;
}
.btnCerrar:active {
  background: #af4d49;
}
</style>