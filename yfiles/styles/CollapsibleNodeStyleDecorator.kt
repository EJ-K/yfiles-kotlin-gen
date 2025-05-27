// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import web.svg.SVGElement
import yfiles.geometry.Insets
import yfiles.geometry.Size
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata
import yfiles.view.IRenderContext

/**
 * Decorates a node style with an additional button for expanding and collapsing groups.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [CollapsibleNodeStyleDecorator] class using the provided style for the [wrappedStyle][CollapsibleNodeStyleDecorator] property.
 * @param [wrappedStyle] The decorated style. If none is provided, the [wrappedStyle][CollapsibleNodeStyleDecorator] property will be initialized with a new [ShapeNodeStyle] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23CollapsibleNodeStyleDecorator-constructor-CollapsibleNodeStyleDecorator">Online Documentation</a>
 * 
 * @property wrappedStyle
 * Gets or sets the wrapped node style that will be used to perform the actual rendering of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23wrappedStyle">Online Documentation</a>
 */
open external class CollapsibleNodeStyleDecorator (
final var wrappedStyle: INodeStyle = definedExternally) : INodeStyle {
  /**
   * Gets or sets an [ILabelModelParameter] that determines the placement of the button for toggling the expanded state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23buttonPlacement">Online Documentation</a>
   */
  final var buttonPlacement: ILabelModelParameter
  
  /**
   * Gets or sets the size of the button.
   * 
   * The default size is `[14, 14]`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23buttonSize">Online Documentation</a>
   */
  final var buttonSize: Size
  
  /**
   * Gets or sets the padding to use for the [IGroupPaddingProvider][yfiles.input.IGroupPaddingProvider] that will be reported by the [renderer][CollapsibleNodeStyleDecorator]'s [ILookup][yfiles.collections.ILookup].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23padding">Online Documentation</a>
   */
  final var padding: Insets
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23CollapsibleNodeStyleDecorator-method-clone">Online Documentation</a>
   */
  final override fun clone(): CollapsibleNodeStyleDecorator
  
  /**
   * Creates the button's svg element.
   * @param [context] The context.
   * @param [expanded] Specifies whether the button is created for the expanded or the collapsed state.
   * @param [size] The button size.
   * @return The button's svg element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollapsibleNodeStyleDecorator%23CollapsibleNodeStyleDecorator-method-createButton">Online Documentation</a>
   */
  protected open fun createButton(
    context: IRenderContext,
    expanded: Boolean,
    size: Size,
  ): SVGElement
  
  companion object : ClassMetadata<CollapsibleNodeStyleDecorator> {
  }
}

inline fun CollapsibleNodeStyleDecorator(
    block: CollapsibleNodeStyleDecorator.() -> Unit
): CollapsibleNodeStyleDecorator {
    return CollapsibleNodeStyleDecorator()
        .apply(block)
}
