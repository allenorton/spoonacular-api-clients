package com.spoonacular.client.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import spoonacular._
import java.math.BigDecimal

/**
 * 
 * @param ingredientList The ingredient list of the recipe, one ingredient per line.
 * @param servings The number of servings.
 * @param defaultCss Whether the default CSS should be added to the response.
 * @param showBacklink Whether to show a backlink to spoonacular. If set false, this call counts against your quota.
 */
case class InlineObject(ingredientList: String,
                servings: BigDecimal,
                defaultCss: Option[Boolean],
                showBacklink: Option[Boolean]
                )

object InlineObject {
    /**
     * Creates the codec for converting InlineObject from and to JSON.
     */
    implicit val decoder: Decoder[InlineObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineObject] = deriveEncoder
}
