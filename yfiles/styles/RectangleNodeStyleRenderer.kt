// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.IRectangle
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.ILookup
import yfiles.graph.INode
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
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
 * Default renderer implementation that can be used for [RectangleNodeStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-constructor-RectangleNodeStyleRenderer">Online Documentation</a>
 */
external open class RectangleNodeStyleRenderer  () : INodeStyleRenderer, IShapeGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets the [INode.layout] of the node this renderer is currently configured for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23layout">Online Documentation</a>
 */
final val layout: IRectangle
/**
 * Gets or sets the node that is currently assigned to this renderer instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23node">Online Documentation</a>
 */
protected final var node: INode
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: RectangleNodeStyle
/**
 * Prepares this instance for subsequent calls after the style and node have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Returns the layout bounds as an upper bound for the painting bound.
 * @param [context] the context to calculate the bounds for
 * @return the bounds or `null` to indicate an unbound area
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the bounds provider for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query the context for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * Get the corner size that is currently used by this renderer.
 * @return The corner size that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getCornerSize">Online Documentation</a>
 */
 open protected   fun getCornerSize():Double
/**
 * Get the corner style that is currently used by this renderer.
 * @return The corner style that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getCornerStyle">Online Documentation</a>
 */
 open protected   fun getCornerStyle():RectangleCornerStyle
/**
 * Get the corners, that are currently used by this renderer.
 * @return The corners, that are currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getCorners">Online Documentation</a>
 */
 open protected   fun getCorners():RectangleCorners
/**
 * Get the CSS class that is currently used by this renderer.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Get the brush that is currently used by this renderer.
 * @return The brush that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getFill">Online Documentation</a>
 */
 open protected   fun getFill():Fill?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query hit test with. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getIntersection">Online Documentation</a>
 */
 override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query marquee intersection tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getOutline">Online Documentation</a>
 */
 override   fun getOutline():GeneralPath?
/**
 * Get whether the corner size, that is currently used by this renderer, is scaled.
 * @return Whether the corner size, that is currently used by this renderer, is scaled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getScaleCornerSize">Online Documentation</a>
 */
 open protected   fun getScaleCornerSize():Boolean
/**
 * Configures the [style] and [node] properties, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the shape geometry for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInside]
 * @see [getIntersection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Get the pen that is currently used by this renderer.
 * @return The pen that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 open protected   fun getStroke():Stroke?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query visibility tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * Tests the [node] using the current [style] for an intersection with the given box.
 * @param [context] the current input mode context
 * @param [rectangle] the box describing the marquee's bounds
 * @return `true` if the node is considered to be captured by the marquee
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-isInside">Online Documentation</a>
 */
 override   fun isInside( location: Point ):Boolean
/**
 * Determines visibility by checking for an intersection with the [layout].
 * @param [context] The context.
 * @param [rectangle] The current clip
 * @return Whether the [layout] is visible in the clip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implements the [ILookup] interface.
 * @param [type] The type to query for.
 * @return An implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyleRenderer%23RectangleNodeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<RectangleNodeStyleRenderer> {
}
}
