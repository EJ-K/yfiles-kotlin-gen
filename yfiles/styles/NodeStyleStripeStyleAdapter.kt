// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ClassMetadata

/**
 * A stripe style decorator that uses a node style instance to render the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleStripeStyleAdapter">Online Documentation</a>
 * 
 * @constructor Creates a stripe style that uses the provided node style to render the stripe.
 * @param [nodeStyle] The node style to use for rendering the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleStripeStyleAdapter%23NodeStyleStripeStyleAdapter-constructor-NodeStyleStripeStyleAdapter">Online Documentation</a>
 * 
 * @property nodeStyle
 * Gets the [INodeStyle] that is used for rendering the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleStripeStyleAdapter%23nodeStyle">Online Documentation</a>
 */
external open class NodeStyleStripeStyleAdapter  (
final var nodeStyle: INodeStyle = definedExternally) : IStripeStyle {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleStripeStyleAdapter%23renderer">Online Documentation</a>
 */
final override val renderer: IStripeStyleRenderer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleStripeStyleAdapter%23NodeStyleStripeStyleAdapter-method-clone">Online Documentation</a>
 */
 override   fun clone():NodeStyleStripeStyleAdapter

companion object : ClassMetadata<NodeStyleStripeStyleAdapter> {
}
}

inline fun NodeStyleStripeStyleAdapter(
    block: NodeStyleStripeStyleAdapter.() -> Unit
): NodeStyleStripeStyleAdapter {
    return NodeStyleStripeStyleAdapter()
        .apply(block)
}
