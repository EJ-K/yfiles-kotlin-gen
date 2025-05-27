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
 * Default renderer implementation that can be used for [ArrowNodeStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-constructor-ArrowNodeStyleRenderer">Online Documentation</a>
 */
external open class ArrowNodeStyleRenderer  () : INodeStyleRenderer, IShapeGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, ILassoTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets the [INode.layout] of the node this renderer is currently configured for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23layout">Online Documentation</a>
 */
final val layout: IRectangle
/**
 * Gets or sets the node that is currently assigned to this renderer instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23node">Online Documentation</a>
 */
protected final var node: INode
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: ArrowNodeStyle
/**
 * Prepares this instance for subsequent calls after the style and node have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Gets the angle of the angled sides in radians that is currently used by this renderer.
 * @return The angle that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getAngle">Online Documentation</a>
 */
 open protected   fun getAngle():Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the bounds provider for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query the context for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * Get the CSS class that is currently used by this renderer.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Gets the direction the shape points to.
 * @return The shape direction that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getDirection">Online Documentation</a>
 */
 open protected   fun getDirection():ArrowNodeDirection
/**
 * Get the brush that is currently used by this renderer.
 * @return The brush that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getFill">Online Documentation</a>
 */
 open protected   fun getFill():Fill?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query hit test with. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getIntersection">Online Documentation</a>
 */
 override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query marquee intersection tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getOutline">Online Documentation</a>
 */
 override   fun getOutline():GeneralPath?
/**
 * Gets the thickness of the arrow shaft as ratio of the node size that is currently used by this renderer.
 * @return The thickness of the arrow shaft that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getShaftRatio">Online Documentation</a>
 */
 open protected   fun getShaftRatio():Double
/**
 * Gets the basic shape that is currently used by this renderer.
 * @return The basic shape that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getShape">Online Documentation</a>
 */
 open protected   fun getShape():ArrowStyleShape
/**
 * Configures the [style] and [node] properties, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the shape geometry for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInside]
 * @see [getIntersection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Get the pen that is currently used by this renderer.
 * @return The pen that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 open protected   fun getStroke():Stroke?
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query visibility tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-isInPath">Online Documentation</a>
 */
 override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-isInside">Online Documentation</a>
 */
 override   fun isInside( location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implements the [ILookup] interface.
 * @param [type] The type to query for.
 * @return An implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyleRenderer%23ArrowNodeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<ArrowNodeStyleRenderer> {
}
}
