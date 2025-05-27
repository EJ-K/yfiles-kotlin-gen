// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.core.Void
import yfiles.geometry.IRectangle
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * A basis implementation of [ISelectionIndicatorInstaller], [IFocusIndicatorInstaller] and [IHighlightIndicatorInstaller] that draws a rectangle using a [template].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [RectangleIndicatorInstaller] class without fixed bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23RectangleIndicatorInstaller-constructor-RectangleIndicatorInstaller()">Online Documentation</a>
 */
external open class RectangleIndicatorInstaller<T : IModelItem>  () : ISelectionIndicatorInstaller<T>, IHighlightIndicatorInstaller<T>, IFocusIndicatorInstaller<T> {
/**
 * Initializes a new instance of the [RectangleIndicatorInstaller] class with fixed bounds and a [String].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23RectangleIndicatorInstaller-constructor-RectangleIndicatorInstaller(IRectangle,string)">Online Documentation</a>
 */
 constructor( fixedBounds: IRectangle? ,
 resourceKey: ResourceKey<IVisualTemplate<Void>>?  = definedExternally)

/**
 * Gets or sets the [IVisualTemplate] to use for this indicator.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23template">Online Documentation</a>
 */
final var template: IVisualTemplate<Void>?
/**
 * Gets or sets whether the installed rectangle will be drawn in the View coordinate system as opposed to the Intermediate coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23useViewCoordinates">Online Documentation</a>
 */
final var useViewCoordinates: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23RectangleIndicatorInstaller-method-addCanvasObject">Online Documentation</a>
 */
 final override   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: T ):ICanvasObject?
/**
 * Factory method that returns an [IRectangle] for a given user object.
 * @return An [IRectangle] for the given item that is [added][ICanvasObjectGroup.addChild] to the [ICanvasObjectGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23RectangleIndicatorInstaller-method-getRectangle">Online Documentation</a>
 */
 open protected   fun getRectangle( userObject: T ):IRectangle?

companion object : ClassMetadata<RectangleIndicatorInstaller<*>> {
/**
 * A [String] that will be used to find the [IVisualTemplate] for drawing the focus indicator.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23FOCUS_TEMPLATE_KEY">Online Documentation</a>
 */
 val FOCUS_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
/**
 * A [String] that will be used to find the [IVisualTemplate] for drawing the highlight indicator.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23HIGHLIGHT_TEMPLATE_KEY">Online Documentation</a>
 */
 val HIGHLIGHT_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
/**
 * A [String] that will be used to find the [IVisualTemplate] for drawing the selection indicator.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleIndicatorInstaller%23SELECTION_TEMPLATE_KEY">Online Documentation</a>
 */
 val SELECTION_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
}
}
