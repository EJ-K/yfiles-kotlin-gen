// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.YFlags

/**
 * Enumeration that specifies the various hot spot regions of an [IStripe][yfiles.graph.IStripe] instance.
 * @see [StripeSubregion]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes">Online Documentation</a>
 */
external class StripeSubregionTypes 
    private constructor(): YFlags<StripeSubregionTypes> {
    companion object {
    /**
 * No active hotspot region.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes%23NONE">Online Documentation</a>
 */
val NONE: StripeSubregionTypes
/**
 * The hot spot region includes the stripe itself.
 * 
 * Value - `1`
 * @see [IStripeHitTestHelper.getStripeHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes%23STRIPE">Online Documentation</a>
 */
val STRIPE: StripeSubregionTypes
/**
 * The hot spot region includes the leading stripe header.
 * 
 * Value - `2`
 * @see [IStripeHitTestHelper.getLeadingHeaderHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes%23LEADING_HEADER">Online Documentation</a>
 */
val LEADING_HEADER: StripeSubregionTypes
/**
 * The hot spot region includes the trailing stripe header.
 * 
 * Value - `4`
 * @see [IStripeHitTestHelper.getTrailingHeaderHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes%23TRAILING_HEADER">Online Documentation</a>
 */
val TRAILING_HEADER: StripeSubregionTypes
/**
 * The hot spot region includes both stripe headers.
 * 
 * Value - `6`
 * @see [IStripeHitTestHelper.getTrailingHeaderHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes%23HEADER">Online Documentation</a>
 */
val HEADER: StripeSubregionTypes
/**
 * The hot spot region includes the near-border region of the stripe.
 * 
 * Value - `8`
 * @see [IStripeHitTestHelper.getNearBorderHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes%23NEAR_BORDER">Online Documentation</a>
 */
val NEAR_BORDER: StripeSubregionTypes
/**
 * The hot spot region includes the stripe far-border region.
 * 
 * Value - `16`
 * @see [IStripeHitTestHelper.getFarBorderHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes%23FAR_BORDER">Online Documentation</a>
 */
val FAR_BORDER: StripeSubregionTypes
/**
 * Flag for any stripe region.
 * 
 * Value - `31`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSubregionTypes%23ALL">Online Documentation</a>
 */
val ALL: StripeSubregionTypes

    }
}
