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
import yfiles.geometry.IOrientedRectangle
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * An abstract base class for the [ISelectionIndicatorInstaller], [IFocusIndicatorInstaller] and [IHighlightIndicatorInstaller] implementations that draws an oriented rectangle using a [template].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [OrientedRectangleIndicatorInstaller] class without fixed bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller%23OrientedRectangleIndicatorInstaller-constructor-OrientedRectangleIndicatorInstaller()">Online Documentation</a>
 */
external open class OrientedRectangleIndicatorInstaller<T : IModelItem>  () : ISelectionIndicatorInstaller<T>, IHighlightIndicatorInstaller<T>, IFocusIndicatorInstaller<T> {
/**
 * Initializes a new instance of the [OrientedRectangleIndicatorInstaller] class with fixed bounds and a [String].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller%23OrientedRectangleIndicatorInstaller-constructor-OrientedRectangleIndicatorInstaller(IOrientedRectangle,string)">Online Documentation</a>
 */
 constructor( fixedBounds: IOrientedRectangle? ,
 templateKey: ResourceKey<IVisualTemplate<Void>>?  = definedExternally)

/**
 * Gets or sets the [IVisualTemplate] to use for this indicator.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller%23template">Online Documentation</a>
 */
final var template: IVisualTemplate<Void>?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller%23OrientedRectangleIndicatorInstaller-method-addCanvasObject">Online Documentation</a>
 */
 final override   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: T ):ICanvasObject?
/**
 * Factory method that returns an [IOrientedRectangle] for a given user object.
 * @return An [IOrientedRectangle] for the given item that is [added][ICanvasObjectGroup.addChild] to the [ICanvasObjectGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller%23OrientedRectangleIndicatorInstaller-method-getRectangle">Online Documentation</a>
 */
 open protected   fun getRectangle( item: T ):IOrientedRectangle?

companion object : ClassMetadata<OrientedRectangleIndicatorInstaller<*>> {
/**
 * A [String] that will be used to find the [IVisualTemplate] for drawing the focus indicator.
 * 
 * The default template has the `yfiles-focus-template` and `yfiles-label-focus-template` CSS classes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller%23FOCUS_TEMPLATE_KEY">Online Documentation</a>
 */
 val FOCUS_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
/**
 * A [String] that will be used to find the [IVisualTemplate] for drawing the highlight indicator.
 * 
 * The default template has the `yfiles-highlight-template` and `yfiles-label-highlight-template` CSS classes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller%23HIGHLIGHT_TEMPLATE_KEY">Online Documentation</a>
 */
 val HIGHLIGHT_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
/**
 * A [String] that will be used to find the [IVisualTemplate] for drawing the selection indicator.
 * 
 * The default template has the `yfiles-selection-template` and `yfiles-label-selection-template` CSS classes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrientedRectangleIndicatorInstaller%23SELECTION_TEMPLATE_KEY">Online Documentation</a>
 */
 val SELECTION_TEMPLATE_KEY: ResourceKey<IVisualTemplate<Void>>
}
}
