// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Insets
import yfiles.lang.InterfaceMetadata
import yfiles.styles.IStripeStyle

/**
 * Interface used by [ITable] and the like to declare and obtain the defaults for stripes and their labels.
 * @see [ITable.rowDefaults]
 * @see [ITable.columnDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeDefaults">Online Documentation</a>
 */
external interface IStripeDefaults  {
  /**
   * Gets or sets the defaults for labels at stripes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeDefaults%23labels">Online Documentation</a>
   */
  var labels: ILabelDefaults
  
  /**
   * Gets or sets the default minimum stripe size.
   * @see [IStripe.minimumSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeDefaults%23minimumSize">Online Documentation</a>
   */
  var minimumSize: Double
  
  /**
   * Gets or sets the default padding for a stripe.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeDefaults%23padding">Online Documentation</a>
   */
  var padding: Insets
  
  /**
   * Gets or sets a value indicating whether the [style][IStripeDefaults] instance should be shared referentially or [cloned][yfiles.lang.ICloneable] upon a call to [getStyleInstance][IStripeDefaults].
   * @see [getStyleInstance]
   * @see [style]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeDefaults%23shareStyleInstance">Online Documentation</a>
   */
  var shareStyleInstance: Boolean
  
  /**
   * Gets or sets the default stripe size.
   * @see [IStripe.size]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeDefaults%23size">Online Documentation</a>
   */
  var size: Double
  
  /**
   * Gets or sets the style to use for stripes.
   * @see [shareStyleInstance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeDefaults%23style">Online Documentation</a>
   */
  var style: IStripeStyle
  
  /**
   * Factory method that returns a style instance for use with newly created stripes.
   * @return The style to use, which for most implementations is either a [clone][yfiles.lang.ICloneable] of or the [style][IStripeDefaults] property, if [shareStyleInstance][IStripeDefaults] is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeDefaults%23IStripeDefaults-method-getStyleInstance">Online Documentation</a>
   */
  fun getStyleInstance(): IStripeStyle

  
  companion object : InterfaceMetadata<IStripeDefaults> {
  }
}
