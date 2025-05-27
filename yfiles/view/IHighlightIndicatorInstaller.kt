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
 * An interface for objects that can install a visual representation of a highlight decoration of an item in the model displayed in a canvas.
 * @see [HighlightIndicatorManager]
 * @see [ISelectionIndicatorInstaller]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHighlightIndicatorInstaller">Online Documentation</a>
 */
external interface IHighlightIndicatorInstaller<T : IModelItem> : ICanvasObjectInstaller<T> {

companion object : InterfaceMetadata<IHighlightIndicatorInstaller<*>> {
}
}
