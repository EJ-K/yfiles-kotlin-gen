// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Insets
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata

/**
 * Decorates an arbitrary node styles with an additional collapse/expand handle.
 * @see [CollapsibleNodeStyleDecoratorRenderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [CollapsibleNodeStyleDecorator] class using the provided style for the [wrapped] property and the provided [CollapsibleNodeStyleDecoratorRenderer] as renderer.
 * @param [wrapped] The decorated style. If none is provided, the [wrapped] property will be initialized with a [ShapeNodeStyle].
 * @param [renderer] An instance of [CollapsibleNodeStyleDecoratorRenderer] to render this style. If none is provided, a new instance of [CollapsibleNodeStyleDecoratorRenderer] will be set as [renderer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23CollapsibleNodeStyleDecorator-constructor-CollapsibleNodeStyleDecorator">Online Documentation</a>
 */
external open class CollapsibleNodeStyleDecorator  ( wrapped: INodeStyle  = definedExternally,
 renderer: CollapsibleNodeStyleDecoratorRenderer  = definedExternally) : INodeStyle {

/**
 * Gets or sets an [ILabelModelParameter] that determines the placement of the button for toggling the expanded state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23buttonPlacement">Online Documentation</a>
 */
final var buttonPlacement: ILabelModelParameter
/**
 * Gets or sets the insets to use for the [INodeInsetsProvider][yfiles.input.INodeInsetsProvider] that will be reported by the [CollapsibleNodeStyleDecoratorRenderer]'s [ILookup][yfiles.graph.ILookup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23insets">Online Documentation</a>
 */
final var insets: Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23renderer">Online Documentation</a>
 */
final override val renderer: INodeStyleRenderer
/**
 * Gets or sets the wrapped node style that will be used to perform the actual rendering of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23wrapped">Online Documentation</a>
 */
final var wrapped: INodeStyle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23CollapsibleNodeStyleDecorator-method-clone">Online Documentation</a>
 */
 override   fun clone():CollapsibleNodeStyleDecorator

companion object : ClassMetadata<CollapsibleNodeStyleDecorator> {
}
}

inline fun CollapsibleNodeStyleDecorator(
    block: CollapsibleNodeStyleDecorator.() -> Unit
): CollapsibleNodeStyleDecorator {
    return CollapsibleNodeStyleDecorator()
        .apply(block)
}
