import concot.*

Item comId1 = Item.get(1)
println comId1.isDirty()
comId1.nome = "Brota"
println comId1.isDirty()
//comId1.save()
