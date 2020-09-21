<template>
  <div class="successReg">
    <div class="boxSuccess">
      <h1>Cuenta creada con éxito!!</h1>
      <br />
      <h1>Le llegará un correo para confirmar su email pronto...</h1>
      <br />
      <br />
      <router-link to="/">
        <button class="btn">Volver a Página principal</button>
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: "SuccessReg",
  props: {},
};
</script>

<style>
.boxSuccess {
  background: #f1faee;
  border-radius: 6px;
  padding: 40px;
  width: 80%;
  margin: 50px auto;
  box-shadow: 15px 15px 10px rgba(0, 0, 0, 0.1);
  text-align: left;
}
</style>