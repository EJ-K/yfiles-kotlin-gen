// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import web.svg.SVGGElement
import yfiles.geometry.GeneralPath
import yfiles.geometry.IRectangle
import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.ILookup
import yfiles.graph.INode
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.Fill
import yfiles.view.IBoundsProvider
import yfiles.view.ICanvasContext
import yfiles.view.IRenderContext
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator
import yfiles.view.Stroke
import yfiles.view.Visual

/**
 * Default renderer implementation for [GroupNodeStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-constructor-GroupNodeStyleRenderer">Online Documentation</a>
 */
external open class GroupNodeStyleRenderer  () : INodeStyleRenderer, IShapeGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, IHitTestable, ILassoTestable, ILookup, IVisualCreator {

/**
 * Gets the [INode.layout] of the node this renderer is currently configured for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23layout">Online Documentation</a>
 */
final val layout: IRectangle
/**
 * Gets or sets the node that is currently assigned to this renderer instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23node">Online Documentation</a>
 */
protected final var node: INode
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: GroupNodeStyle
/**
 * Prepares this instance for subsequent calls after the style and node have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * Creates the visual representation for the node's collapse/expand icon.
 * @param [context] The context that describes where the visual will be used.
 * @param [expanded] `true` if the node is currently expanded; `false` otherwise.
 * @param [bounds] The size and location of the icon. May be [empty][Rect.isEmpty].
 * @return The visual representation for the node's collapse/expand icon or `null` if no icon should be shown.
 * @see [updateIconVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-createIconVisual">Online Documentation</a>
 */
 open protected   fun createIconVisual( context: IRenderContext ,
 expanded: Boolean ,
 bounds: Rect ):SVGGElement?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Returns the union of the node's layout and area that shows the style's drop shadow.
 * @param [context] the context to calculate the bounds for
 * @return Returns the union of the node's layout and area that shows the style's drop shadow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the bounds provider for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * Gets the content area brush that is currently used by this renderer.
 * @return The content area brush that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getContentAreaFill">Online Documentation</a>
 */
 open protected   fun getContentAreaFill():Fill?
/**
 * Gets the content area insets that are currently used by this renderer.
 * @return The content area insets that are currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getContentAreaInsets">Online Documentation</a>
 */
 open protected   fun getContentAreaInsets():Insets
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query the context for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * Gets the corner radius that is currently used by this renderer.
 * @return The corner radius that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getCornerRadius">Online Documentation</a>
 */
 open protected   fun getCornerRadius():Double
/**
 * Get the CSS class that is currently used by this renderer.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Gets the folder icon type that is currently used by this renderer.
 * @return The folder icon type that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getFolderIcon">Online Documentation</a>
 */
 open protected   fun getFolderIcon():GroupNodeStyleIconType
/**
 * Gets the group icon type that is currently used by this renderer.
 * @return The group icon type that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getGroupIcon">Online Documentation</a>
 */
 open protected   fun getGroupIcon():GroupNodeStyleIconType
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query hit test with. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * Gets the icon background brush that is currently used by this renderer.
 * @return The icon background brush that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getIconBackgroundFill">Online Documentation</a>
 */
 open protected   fun getIconBackgroundFill():Fill?
/**
 * Gets the icon background shape that is currently used by this renderer.
 * @return The icon background shape that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getIconBackgroundShape">Online Documentation</a>
 */
 open protected   fun getIconBackgroundShape():GroupNodeStyleIconBackgroundShape
/**
 * Gets the icon foreground brush that is currently used by this renderer.
 * @return The icon foreground brush that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getIconForegroundFill">Online Documentation</a>
 */
 open protected   fun getIconForegroundFill():Fill?
/**
 * Gets the icon offset that is currently used by this renderer.
 * @return The icon offset that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getIconOffset">Online Documentation</a>
 */
 open protected   fun getIconOffset():Double
/**
 * Gets the icon position that is currently used by this renderer.
 * @return The icon position that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getIconPosition">Online Documentation</a>
 */
 open protected   fun getIconPosition():GroupNodeStyleIconPosition
/**
 * Gets the icon size that is currently used by this renderer.
 * @return The icon size that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getIconSize">Online Documentation</a>
 */
 open protected   fun getIconSize():Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getIntersection">Online Documentation</a>
 */
 override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query marquee intersection tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * Gets the minimum content area size that is currently used by this renderer.
 * @return The minimum content area size that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getMinimumContentAreaSize">Online Documentation</a>
 */
 open protected   fun getMinimumContentAreaSize():Size
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getOutline">Online Documentation</a>
 */
 override   fun getOutline():GeneralPath?
/**
 * Configures the [style] and [node] properties, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the shape geometry for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInside]
 * @see [getIntersection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Gets the pen that is currently used by this renderer.
 * @return The pen that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 open protected   fun getStroke():Stroke?
/**
 * Gets the tab background brush that is currently used by this renderer.
 * @return The tab background brush that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getTabBackgroundFill">Online Documentation</a>
 */
 open protected   fun getTabBackgroundFill():Fill?
/**
 * Gets the tab brush that is currently used by this renderer.
 * @return The tab brush that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getTabFill">Online Documentation</a>
 */
 open protected   fun getTabFill():Fill?
/**
 * Gets the tab height that is currently used by this renderer.
 * @return The tab height that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getTabHeight">Online Documentation</a>
 */
 open protected   fun getTabHeight():Double
/**
 * Gets the tab inset that is currently used by this renderer.
 * @return The tab inset that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getTabInset">Online Documentation</a>
 */
 open protected   fun getTabInset():Double
/**
 * Gets the tab position that is currently used by this renderer.
 * @return The tab position that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getTabPosition">Online Documentation</a>
 */
 open protected   fun getTabPosition():GroupNodeStyleTabPosition
/**
 * Gets the tab size policy that is currently used by this renderer.
 * @return The tab size policy that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getTabSizePolicy">Online Documentation</a>
 */
 open protected   fun getTabSizePolicy():GroupNodeStyleTabSizePolicy
/**
 * Gets the tab slope that is currently used by this renderer.
 * @return The tab slope that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getTabSlope">Online Documentation</a>
 */
 open protected   fun getTabSlope():Double
/**
 * Gets the tab width that is currently used by this renderer.
 * @return The tab width that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getTabWidth">Online Documentation</a>
 */
 open protected   fun getTabWidth():Double
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query visibility tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 override   fun getVisibilityTestable( node: INode ,
 style: INodeStyle ):IVisibilityTestable
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the [IVisualCreator] for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [createVisual]
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator
/**
 * Returns `true` if this renderer is currently drawing a drop shadow; `false` otherwise.
 * @return `true` if this renderer is currently drawing a drop shadow; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isDrawShadow">Online Documentation</a>
 */
 open protected   fun isDrawShadow():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * Returns `true` if this renderer is currently considering the content area to be hit transparent; `false` otherwise.
 * @return `true` if this renderer is currently considering the content area to be hit transparent; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isHitTransparentContentArea">Online Documentation</a>
 */
 open protected   fun isHitTransparentContentArea():Boolean
/**
 * Tests the [node] using the current [style] for an intersection with the given box.
 * @param [context] the current input mode context
 * @param [rectangle] the box describing the marquee's bounds
 * @return `true` if the node is considered to be captured by the marquee
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * Tests the [node] using the current [style] for an intersection with the the given path.
 * @param [context] the current input mode context
 * @param [lassoPath] the path describing the lasso selection bounds
 * @return `true` if the item is considered to be captured by the lasso
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isInPath">Online Documentation</a>
 */
 final override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isInside">Online Documentation</a>
 */
 override   fun isInside( location: Point ):Boolean
/**
 * Returns `true` if this renderer is currently clipping the visualization to allow for a transparent content area; `false` otherwise.
 * @return `true` if this renderer is currently allowing the content area to be rendered transparently; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isRenderTransparentContentArea">Online Documentation</a>
 */
 open protected   fun isRenderTransparentContentArea():Boolean
/**
 * Returns `true` if this renderer is currently showing the content area for collapsed nodes; `false` otherwise.
 * @return `true` if this renderer is currently showing the content area for collapsed nodes; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isShowFolderContentArea">Online Documentation</a>
 */
 open protected   fun isShowFolderContentArea():Boolean
/**
 * Determines visibility by checking for an intersection with the [layout].
 * @param [context] The context.
 * @param [rectangle] The current clip
 * @return Whether the [layout] is visible in the clip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implements the [ILookup] interface.
 * @param [type] The type to query for.
 * @return An implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Updates the visual representation for the node's collapse/expand icon previously created by [createIconVisual].
 * @param [context] The context that describes where the visual will be used.
 * @param [expanded] `true` if the node is currently expanded; `false` otherwise.
 * @param [bounds] The size and location of the icon. May be [empty][Rect.isEmpty].
 * @param [oldVisual] The visual instance that has been returned the last time [createIconVisual] has been called.
 * @return The visual representation for the node's collapse/expand icon or `null` if no icon should be shown.
 * @see [createIconVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-updateIconVisual">Online Documentation</a>
 */
 open protected   fun updateIconVisual( context: IRenderContext ,
 expanded: Boolean ,
 bounds: Rect ,
 oldVisual: SVGGElement? ):SVGGElement?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleRenderer%23GroupNodeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<GroupNodeStyleRenderer> {
}
}
