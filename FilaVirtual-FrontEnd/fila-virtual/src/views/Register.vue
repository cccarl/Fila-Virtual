<template>
  <div class="register">
    <Header msgBoton1="Ingresar" msgBoton2="Registrarse"/>
    <FormRegister />
  </div>
</template>

<script>
import FormRegister from "@/components/FormRegister.vue";
import Header from "@/components/Header.vue";

export default {
  name: "Register",
  components: {
    FormRegister,
    Header,
  },
};
</script>

<style>
</style>