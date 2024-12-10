package com.example.calorietracker.adapters

//class MealsAdapter(private val meals: List<Meal>) : RecyclerView.Adapter<MealsAdapter.MealViewHolder>() {
//
//    inner class MealViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val mealName: TextView = itemView.findViewById(R.id.tvMealName)
//        val mealCalories: TextView = itemView.findViewById(R.id.tvMealCalories)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_meal, parent, false)
//        return MealViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
//        val meal = meals[position]
//        holder.mealName.text = meal.name
//        holder.mealCalories.text = "${meal.calories} kcal"
//    }
//
//    override fun getItemCount(): Int = meals.size
//}