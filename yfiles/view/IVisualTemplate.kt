// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Template factory for creating visual representations of arbitrary data objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisualTemplate">Online Documentation</a>
 */
external interface IVisualTemplate<in T> : YObject {
/**
 * This method is called by the framework to create a [SvgVisual] with the given `bounds`.
 * @param [context] The context that describes where the visual will be used.
 * @param [bounds] The current bounds to use for the visual.
 * @param [dataObject] The data object to visualize.
 * @return The visual to include in the canvas object visual tree. This may be `null`.
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisualTemplate%23IVisualTemplate-method-createVisual">Online Documentation</a>
 */
   fun createVisual( context: IRenderContext ,
 bounds: Rect ,
 dataObject: T ):SvgVisual?
/**
 * This method updates or replaces a previously created [SvgVisual] to adjust to the changed `bounds`.
 * @param [context] The context that describes where the visual will be used in.
 * @param [oldVisual] The visual instance that had been returned the last time the [createVisual] method was called on this instance.
 * @param [bounds] The current bounds to use for the visual.
 * @param [dataObject] The data object to visualize.
 * @return `oldVisual`, if this instance modified the visual, or a new visual that should replace the existing one in the canvas object visual tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IVisualTemplate%23IVisualTemplate-method-updateVisual">Online Documentation</a>
 */
   fun updateVisual( context: IRenderContext ,
 oldVisual: SvgVisual ,
 bounds: Rect ,
 dataObject: T ):SvgVisual?

companion object : InterfaceMetadata<IVisualTemplate<*>> {
}
}
