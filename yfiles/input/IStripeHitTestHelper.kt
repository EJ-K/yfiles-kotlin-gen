// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Helper interface that allows to bundle [IHitTestable] implementations for the main regions of a [IStripe][yfiles.graph.IStripe] instance.
 * 
 * The default [IRow][yfiles.graph.IRow] and [IColumn][yfiles.graph.IColumn] implementations provide default implementations of this interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeHitTestHelper">Online Documentation</a>
 */
external interface IStripeHitTestHelper : YObject {
/**
 * Return a [IHitTestable] that should report hits on the far border region of the stripe.
 * @return a [IHitTestable] that should report hits on the far border region of the stripe.
 * @see [StripeSubregion]
 * @see [StripeSubregionTypes.FAR_BORDER]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeHitTestHelper%23IStripeHitTestHelper-method-getFarBorderHitTestable">Online Documentation</a>
 */
   fun getFarBorderHitTestable():IHitTestable
/**
 * Return a [IHitTestable] that should report hits on the leading header region of the stripe.
 * @return a [IHitTestable] that should report hits on the header region of the stripe.
 * @see [StripeSubregion]
 * @see [StripeSubregionTypes.HEADER]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeHitTestHelper%23IStripeHitTestHelper-method-getLeadingHeaderHitTestable">Online Documentation</a>
 */
   fun getLeadingHeaderHitTestable():IHitTestable
/**
 * Return a [IHitTestable] that should report hits on the near border region of the stripe.
 * @return a [IHitTestable] that should report hits on the near border region of the stripe.
 * @see [StripeSubregion]
 * @see [StripeSubregionTypes.NEAR_BORDER]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeHitTestHelper%23IStripeHitTestHelper-method-getNearBorderHitTestable">Online Documentation</a>
 */
   fun getNearBorderHitTestable():IHitTestable
/**
 * Return a [IHitTestable] that should report hits on the whole stripe.
 * @return a [IHitTestable] that should report hits on the whole stripe.
 * @see [StripeSubregion]
 * @see [StripeSubregionTypes.STRIPE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeHitTestHelper%23IStripeHitTestHelper-method-getStripeHitTestable">Online Documentation</a>
 */
   fun getStripeHitTestable():IHitTestable
/**
 * Return a [IHitTestable] that should report hits on the trailing header region of the stripe.
 * @return a [IHitTestable] that should report hits on the header region of the stripe.
 * @see [StripeSubregion]
 * @see [StripeSubregionTypes.HEADER]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeHitTestHelper%23IStripeHitTestHelper-method-getTrailingHeaderHitTestable">Online Documentation</a>
 */
   fun getTrailingHeaderHitTestable():IHitTestable

companion object : InterfaceMetadata<IStripeHitTestHelper> {
}
}
