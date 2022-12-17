<template>
  <div style="text-align: center">
    <TABLE border>
      <TR>
        <TH>Номер вагона</TH>
        <TH>Идентификатор поезда</TH>
        <TH>Код операции с вагоном</TH>
        <TH>Порядковый номер вагона в поезде</TH>
      </TR>
<!--      <div v-for="vagon in vagonList" v-bind:key="vagon.nomvag">
        <TR>
          <TD>{{vagon.idPoezd}}</TD>
        </TR>
      </div>-->
      <VagonRow v-for="vagon in vagonList" v-bind:key="vagon.nomvag" :vagon-data="vagon"></VagonRow>
    </TABLE>
  </div>
</template>

<script>
import VagonRow from "@/components/VagonRow"

export default {
  name: "VagonList",
  components: {
    VagonRow
  },
  computed: {
    vagonList() {
      return this.$store.getters.getVagonList
    }
  }
}
</script>

<style scoped>

</style>