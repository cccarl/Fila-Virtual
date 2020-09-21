<template>
  <div class="successRegister">
    <Header msgBoton1="Ingresar" msgBoton2="Registrarse"/>
    <SuccessReg />
  </div>
</template>

<script>
import SuccessReg from "@/components/SuccessReg.vue";
import Header from "@/components/Header.vue";

export default {
  name: "SuccessRegister",
  components: {
    SuccessReg,
    Header,
  },
};
</script>

<style>
</style>