// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.ILookup
import yfiles.graph.IStripe
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.view.IVisualCreator

/**
 * Interface used by [IStripeStyle] implementations that can be used to query the actual [IVisualCreator] implementation for a stripe and an associated style.
 * @see [IStripeStyle]
 * @see [IStripe]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeStyleRenderer">Online Documentation</a>
 */
external interface IStripeStyleRenderer : YObject {
/**
 * Gets a temporary context instance that can be used to query additional information for the stripe's style.
 * @param [stripe] The stripe to provide a context instance for.
 * @param [style] The style to use for the context.
 * @return An non-`null` lookup implementation.
 * @see [ILookup.EMPTY]
 * @see [ILookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeStyleRenderer%23IStripeStyleRenderer-method-getContext">Online Documentation</a>
 */
   fun getContext( stripe: IStripe ,
 style: IStripeStyle ):ILookup
/**
 * Gets an implementation of the [IVisualCreator] interface that can handle the provided stripe and its associated style.
 * @param [stripe] The stripe to provide an instance for
 * @param [style] The style to use for the creation of the visual
 * @return An implementation that may be used to subsequently create or update the visual for the stripe. Clients should not cache this instance and must always call this method immediately before using the value returned. This enables the use of the flyweight design pattern for implementations. This method may not return `null` but should yield a [void][yfiles.view.VoidVisualCreator.INSTANCE] implementation instead.
 * @see [VoidVisualCreator.INSTANCE][yfiles.view.VoidVisualCreator.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeStyleRenderer%23IStripeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
   fun getVisualCreator( stripe: IStripe ,
 style: IStripeStyle ):IVisualCreator

companion object : InterfaceMetadata<IStripeStyleRenderer> {
}
}
