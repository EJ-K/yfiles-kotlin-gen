// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Rect
import yfiles.graph.IModelItem
import yfiles.lang.IPropertyObservable
import yfiles.lang.InterfaceMetadata
import yfiles.view.CanvasComponent

/**
 * Exposes properties of a graph element to which a `TemplateBinding` can be bound.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext">Online Documentation</a>
 */
external interface ITemplateStyleBindingContext : IPropertyObservable {
/**
 * Gets or sets the bounds of the visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23bounds">Online Documentation</a>
 */
val bounds: Rect
/**
 * Gets or sets the [CanvasComponent] instance this instance is used in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23canvasComponent">Online Documentation</a>
 */
val canvasComponent: CanvasComponent?
/**
 * Gets the height of the visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23height">Online Documentation</a>
 */
val height: Double
/**
 * Gets or sets the item that is rendered by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23item">Online Documentation</a>
 */
val item: IModelItem
/**
 * Gets or sets a value indicating whether the item is the currently focused item in the [GraphComponent][yfiles.view.GraphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23itemFocused">Online Documentation</a>
 */
var itemFocused: Boolean
/**
 * Gets or sets a value indicating whether the item is currently highlighted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23itemHighlighted">Online Documentation</a>
 */
var itemHighlighted: Boolean
/**
 * Gets or sets a value indicating whether the item is currently selected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23itemSelected">Online Documentation</a>
 */
var itemSelected: Boolean
/**
 * Gets or sets the style tag that is associated with the style that created this visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23styleTag">Online Documentation</a>
 */
val styleTag: StyleTag?
/**
 * Gets the width of the visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23width">Online Documentation</a>
 */
val width: Double
/**
 * Gets the current zoom level of the [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITemplateStyleBindingContext%23zoom">Online Documentation</a>
 */
val zoom: Double

companion object : InterfaceMetadata<ITemplateStyleBindingContext> {
}
}
