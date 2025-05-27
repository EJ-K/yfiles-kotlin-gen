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
 * Default renderer implementation that can be used for [ShapeNodeStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-constructor-ShapeNodeStyleRenderer">Online Documentation</a>
 */
external open class ShapeNodeStyleRenderer  () : INodeStyleRenderer, IShapeGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, IHitTestable, ILookup, IVisualCreator, ILassoTestable {

/**
 * Gets the [INode.layout] of the node this renderer is currently configured for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23layout">Online Documentation</a>
 */
final val layout: IRectangle
/**
 * Gets or sets the currently configured node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23node">Online Documentation</a>
 */
protected final var node: INode
/**
 * Gets or sets the radius that is used to draw rounded edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23roundRectArcRadius">Online Documentation</a>
 */
open var roundRectArcRadius: Double
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: ShapeNodeStyle
/**
 * Prepares this instance for subsequent calls after the style and node have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Returns the layout bounds as an upper bound for the painting bound.
 * @param [context] the context to calculate the bounds for
 * @return the bounds or `null` to indicate an unbound area
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the bounds provider for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query the context for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * Get the CSS class that is currently used by this renderer.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Get the [Fill] that is currently used by this renderer.
 * @return The [Fill] that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getFill">Online Documentation</a>
 */
 open protected   fun getFill():Fill?
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query hit test with. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getIntersection">Online Documentation</a>
 */
 override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Returns the aspect ratio with which the shape should be rendered.
 * @return Returns the desired aspect ratio with which the shape should be rendered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getIntrinsicAspectRatio">Online Documentation</a>
 */
 open protected   fun getIntrinsicAspectRatio():Double
/**
 * Returns whether the aspect ratio of the shape should be kept.
 * @return `true` it the shape's aspect ratio should be kept.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getKeepIntrinsicAspectRatio">Online Documentation</a>
 */
 open protected   fun getKeepIntrinsicAspectRatio():Boolean
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to query marquee intersection tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getOutline">Online Documentation</a>
 */
 override   fun getOutline():GeneralPath?
/**
 * Get the shape that is currently used by this renderer.
 * @return The shape that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getShape">Online Documentation</a>
 */
 open protected   fun getShape():ShapeNodeShape
/**
 * Configures the [style] and [node] properties, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the shape geometry for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInside]
 * @see [getIntersection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Get the [Stroke] that is currently used by this renderer.
 * @return The [Stroke] that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 open protected   fun getStroke():Stroke?
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query visibility tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * Tests the [node] using the current [style] for an intersection with the given box.
 * @param [context] the current input mode context
 * @param [rectangle] the box describing the marquee's bounds
 * @return `true` if the node is considered to be captured by the marquee
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-isInPath">Online Documentation</a>
 */
 override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-isInside">Online Documentation</a>
 */
 override   fun isInside( location: Point ):Boolean
/**
 * Determines visibility by checking for an intersection with the [layout].
 * @param [context] The context.
 * @param [rectangle] The current clip
 * @return Whether the [layout] is visible in the clip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implements the [ILookup] interface.
 * @param [type] The type to query for.
 * @return An implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyleRenderer%23ShapeNodeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<ShapeNodeStyleRenderer> {
}
}

inline fun ShapeNodeStyleRenderer(
    block: ShapeNodeStyleRenderer.() -> Unit
): ShapeNodeStyleRenderer {
    return ShapeNodeStyleRenderer()
        .apply(block)
}
