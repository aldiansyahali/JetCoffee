package com.ali.jetcoffee.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.ali.jetcoffee.R

data class Category(
    @DrawableRes val imageCategory: Int,
    @StringRes val textCategory: Int
)

val dummyCategory = listOf(
    R.drawable.group3 to R.string.category_all,
    R.drawable.group3 to R.string.category_americano,
    R.drawable.group4 to R.string.category_cappuccino,
    R.drawable.icon_category_espresso to R.string.category_espresso,
    R.drawable.icon_category_frappe to R.string.category_frappe,
    R.drawable.icon_category_latte to R.string.category_latte,
    R.drawable.icon_category_macchiato to R.string.category_macchiato,
    R.drawable.icon_category_mocha to R.string.category_mocha,
).map { Category(it.first, it.second) }