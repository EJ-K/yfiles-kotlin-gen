// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.INode
import yfiles.graph.IStripe
import yfiles.lang.ClassMetadata

/**
 * Further describes the result of a hit test on a stripe or table.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregion">Online Documentation</a>
 * 
 * @constructor Create a new instance that describes the specific subregion.
 * @param [subregionType] The specific subregion
 * @param [stripe] The stripe
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregion%23StripeSubregion-constructor-StripeSubregion">Online Documentation</a>
 * 
 * @property subregionType
 * Gets the specific subregion type that this instance describes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregion%23subregionType">Online Documentation</a>
 * 
 * @property stripe
 * Gets the stripe that this instance describes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregion%23stripe">Online Documentation</a>
 */
external class StripeSubregion (
final val subregionType: StripeSubregionTypes,
final val stripe: IStripe)  {
  /**
   * Gets the node the region is associated with.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregion%23targetTableNode">Online Documentation</a>
   */
  final val targetTableNode: INode?
  
  companion object : ClassMetadata<StripeSubregion> {
  }
}
