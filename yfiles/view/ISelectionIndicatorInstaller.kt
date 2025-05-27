// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IModelItem
import yfiles.lang.InterfaceMetadata

/**
 * An interface for objects that can install a visual representation of a selection decoration of an item in the model displayed in a canvas.
 * @see [SelectionIndicatorManager]
 * @see [IHighlightIndicatorInstaller]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISelectionIndicatorInstaller">Online Documentation</a>
 */
external interface ISelectionIndicatorInstaller<T : IModelItem> : ICanvasObjectInstaller<T> {

companion object : InterfaceMetadata<ISelectionIndicatorInstaller<*>> {
}
}
