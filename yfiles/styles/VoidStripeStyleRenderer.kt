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
import yfiles.lang.ClassMetadata
import yfiles.view.IVisualCreator

/**
 * A void implementation of a stripe style renderer that does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidStripeStyleRenderer">Online Documentation</a>
 */
external  class VoidStripeStyleRenderer 
private constructor () : IStripeStyleRenderer {

/**
 * Yields the [ILookup.EMPTY] that will not yield anything.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidStripeStyleRenderer%23VoidStripeStyleRenderer-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( stripe: IStripe ,
 style: IStripeStyle ):ILookup
/**
 * Yields the [VoidVisualCreator.INSTANCE][yfiles.view.VoidVisualCreator.INSTANCE] that will do nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidStripeStyleRenderer%23VoidStripeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 final override   fun getVisualCreator( stripe: IStripe ,
 style: IStripeStyle ):IVisualCreator

companion object : ClassMetadata<VoidStripeStyleRenderer> {
/**
 * The [VoidStripeStyleRenderer] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidStripeStyleRenderer%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: IStripeStyleRenderer
}
}
