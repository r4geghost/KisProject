<template>
  <TR>
    <TD>{{vagonData.nomvag}}</TD>
    <TD>{{vagonData.idPoezd}}</TD>
    <TD>{{vagonData.kodop}}</TD>
    <TD>{{vagonData.pnv}}</TD>
  </TR>
</template>

<script>
export default {
  name: "VagonRow",
  props: {
    vagonData: Object
  }
}
</script>

<style scoped>

</style>