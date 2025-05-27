// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import js.array.ReadonlyArray
import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.SmoothingPolicy
import yfiles.geometry.Tangent
import yfiles.graph.IEdge
import yfiles.graph.ILookup
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.IBoundsProvider
import yfiles.view.IBridgeCreator
import yfiles.view.ICanvasContext
import yfiles.view.IObstacleProvider
import yfiles.view.IRenderContext
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator
import yfiles.view.Stroke
import yfiles.view.Visual

/**
 * An abstract base class for [IEdgeStyleRenderer] implementations that are based on the calculation of a [GeneralPath].
 * @param [TStyle] The exact type of style to use for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PathBasedEdgeStyleRenderer].
 * @param [edgeStyleType] The exact type of style to use for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-constructor-PathBasedEdgeStyleRenderer">Online Documentation</a>
 */
external abstract class PathBasedEdgeStyleRenderer<TStyle : IEdgeStyle>  ( edgeStyleType: YClass<TStyle> ) : IEdgeStyleRenderer, IPathGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, ILassoTestable, IHitTestable, ILookup, IVisualCreator, IObstacleProvider {

/**
 * Gets whether the rendered path should use the [BridgeManager][yfiles.view.BridgeManager] to [add bridges to it.][yfiles.view.BridgeManager.addBridges]
 * @see [getBridgeCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23addBridges">Online Documentation</a>
 */
protected open val addBridges: Boolean
/**
 * Gets or sets the currently configured edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23edge">Online Documentation</a>
 */
protected final var edge: IEdge
/**
 * The path instance that this instance is working with.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23path">Online Documentation</a>
 */
protected final var path: GeneralPath
/**
 * Gets or sets the distance between the node's layout and its self loop control points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23selfLoopDistance">Online Documentation</a>
 */
final var selfLoopDistance: Double
/**
 * Gets or sets the policy with which smoothing is applied to the path when [getSmoothingLength] returns a value larger than 0.
 * 
 * The default value is [SmoothingPolicy.SYMMETRIC].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23smoothingPolicy">Online Documentation</a>
 */
final var smoothingPolicy: SmoothingPolicy
/**
 * Gets or sets a value indicating whether the first and last segments of the path should always begin and end with a straight line segment, respectively.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23straightEndsForSmoothing">Online Documentation</a>
 */
final var straightEndsForSmoothing: Boolean
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: TStyle
/**
 * Prepares this instance for subsequent calls after the style and edge have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * This method should create the basic uncropped path given the control points.
 * @return A path that has to be cropped, yet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-createPath">Online Documentation</a>
 */
 abstract protected   fun createPath():GeneralPath
/**
 * Special implementation that will create a self loop path.
 * @param [roundSelfLoop] Whether to create a round self loop path. If `false` a rectangular path will be created.
 * @return A path for a self loop.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-createSelfLoopPath">Online Documentation</a>
 */
 open protected   fun createSelfLoopPath( roundSelfLoop: Boolean ):GeneralPath
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Crops the edge's path at the nodes.
 * @param [path] The path that should be cropped.
 * @return The cropped path. This is can be either the same instance of the given path or a newly created instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-cropPath">Online Documentation</a>
 */
 open protected   fun cropPath( path: GeneralPath ):GeneralPath
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `edge` parameters, calls [configure] and returns `this`.
 * @param [edge] The edge to retrieve the bounds provider for. The value will be stored in the [edge] property.
 * @param [style] The style to associate with the edge. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( edge: IEdge ,
 style: IEdgeStyle ):IBoundsProvider
/**
 * Yields the [IBridgeCreator] to use for [adding bridges][addBridges] to the [created path][createPath].
 * @return This implementation returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getBridgeCreator">Online Documentation</a>
 */
 open protected   fun getBridgeCreator():IBridgeCreator?
/**
 * Configures the `style` and `edge` parameters, does **not** call [configure] and returns `this`.
 * @param [edge] The edge to query the context for. The value will be stored in the [edge] property.
 * @param [style] The style to associate with the edge. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( edge: IEdge ,
 style: IEdgeStyle ):ILookup
/**
 * Gets the CSS class that will be applied to the edge visualization.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Configures the `style` and `edge` parameters and returns `this`.
 * @see [isHit]
 * @see [configure]
 * @see [IEdgeStyleRenderer.getHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( edge: IEdge ,
 style: IEdgeStyle ):IHitTestable
/**
 * Configures the `style` and `edge` parameters, calls [configure] and returns `this`.
 * @param [edge] The edge to query marquee intersection tests. The value will be stored in the [edge] property.
 * @param [style] The style to associate with the edge. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( edge: IEdge ,
 style: IEdgeStyle ):IMarqueeTestable
/**
 * Returns [createPath] unless [isVisible] yields `false` for the provided context and [IRenderContext.clip].
 * @param [context] The context to yield the obstacles for.
 * @return Either `null` or the result of [createPath].
 * @see [IObstacleProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getObstacles">Online Documentation</a>
 */
 override   fun getObstacles( context: IRenderContext ):GeneralPath?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getPath">Online Documentation</a>
 */
 override   fun getPath():GeneralPath?
/**
 * Gets an implementation of the [IPathGeometry] interface that can handle the provided edge and its associated style.
 * @param [edge] The edge to provide an instance for
 * @param [style] The style to use for the painting
 * @return `this`
 * @see [configure]
 * @see [getTangent]
 * @see [getTangentForSegment]
 * @see [getSegmentCount]
 * @see [getPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getPathGeometry">Online Documentation</a>
 */
 final override   fun getPathGeometry( edge: IEdge ,
 style: IEdgeStyle ):IPathGeometry
/**
 * Returns the number of "segments" this edge's path consists of.
 * @return the number of segments or `-1` if there is no such thing as a segment for this edge.
 * @see [getPathGeometry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getSegmentCount">Online Documentation</a>
 */
 abstract override   fun getSegmentCount():Int
/**
 * Gets the value that determines the radius of the smoothing arcs that can be added to the path at the bends.
 * @return The radius of the arcs to use at the bends of the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getSmoothingLength">Online Documentation</a>
 */
 open protected   fun getSmoothingLength():Double
/**
 * Gets the source arrow from the style.
 * @return The arrow to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getSourceArrow">Online Documentation</a>
 */
 abstract protected   fun getSourceArrow():IArrow?
/**
 * Calculate and update the anchor and the source arrow's direction vector.
 * @param [arrow] The arrow to calculate the anchor for.
 * @return The anchor and directional vector of the arrow, if any exist.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getSourceArrowAnchor">Online Documentation</a>
 */
 open protected   fun getSourceArrowAnchor( arrow: IArrow ):Tangent?
/**
 * Gets the [Stroke] to use to render the path.
 * @return The [Stroke] or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getStroke">Online Documentation</a>
 */
 abstract protected   fun getStroke():Stroke?
/**
 * Calculates the tangent on the edge's path at the given ratio point.
 * @param [ratio] a value in [0,1] where 0 is the source's end and 1 is at the target's end of the visible edge path
 * @return The tangential line, if any exists.
 * @see [getPathGeometry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getTangent">Online Documentation</a>
 */
 abstract override   fun getTangent( ratio: Double ):Tangent?
/**
 * Calculates the tangent on the edge's path at the given ratio point for the given segment.
 * @param [segmentIndex] the segment to use for the calculation
 * @param [ratio] a value in [0,1] where 0 is the source's end and 1 is at the target's end of the segment
 * @return The tangential line, if any exists.
 * @see [getTangent]
 * @see [getSegmentCount]
 * @see [getPathGeometry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getTangentForSegment">Online Documentation</a>
 */
 abstract override   fun getTangentForSegment( segmentIndex: Int ,
 ratio: Double ):Tangent?
/**
 * Gets the target arrow from the style.
 * @return The arrow to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getTargetArrow">Online Documentation</a>
 */
 abstract protected   fun getTargetArrow():IArrow?
/**
 * Calculate and update the anchor and the target arrow's direction vector.
 * @param [arrow] The arrow to calculate the anchor for.
 * @return The anchor and directional vector of the arrow, if any exist.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getTargetArrowAnchor">Online Documentation</a>
 */
 open protected   fun getTargetArrowAnchor( arrow: IArrow ):Tangent?
/**
 * Configures the `style` and `edge` parameters, does **not** call [configure] and returns `this`.
 * @param [edge] The edge to query visibility tests. The value will be stored in the [edge] property.
 * @param [style] The style to associate with the edge. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 override   fun getVisibilityTestable( edge: IEdge ,
 style: IEdgeStyle ):IVisibilityTestable
/**
 * Configures the `style` and `edge` parameters, calls [configure] and returns `this`.
 * @param [edge] The edge to retrieve the [IVisualCreator] for. The value will be stored in the [edge] property.
 * @param [style] The style to associate with the edge. The value will be stored in the [style] property.
 * @return `this`
 * @see [createVisual]
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( edge: IEdge ,
 style: IEdgeStyle ):IVisualCreator
/**
 * This method is overridden for performance reasons.
 * @see [getHitTestable]
 * @see [configure]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-isInPath">Online Documentation</a>
 */
 override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * Calls [configure] and test the [edge] using the [style] for a visible intersection with the clip bounds.
 * @param [context] the current canvas context
 * @param [rectangle] the clip bounds
 * @return `true` if the edge may be painted within the clip bounds.
 * @see [getVisibilityTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<PathBasedEdgeStyleRenderer<*>> {
/**
 * Creates a rectangular self loop path.
 * @param [coordinates] The coordinates of the path points, alternating x and y values.
 * @see [createSelfLoopPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-createRectangleSelfLoop(number[])">Online Documentation</a>
 */
 final protected   fun createRectangleSelfLoop( coordinates: ReadonlyArray<Double> ):GeneralPath
/**
 * Creates a rectangular self loop path.
 * @param [sx] The x coordinate of the source port.
 * @param [sy] The y coordinate of the source port.
 * @param [oppositeX] The x coordinate of the single control point.
 * @param [oppositeY] The y coordinate of the single control point.
 * @param [tx] The x coordinate of the target port.
 * @param [ty] The y coordinate of the target port.
 * @return A path that describes a rectangular self loop.
 * @see [createSelfLoopPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-createRectangleSelfLoop(number,number,number,number,number,number)">Online Documentation</a>
 */
 final protected   fun createRectangleSelfLoop( sx: Double ,
 sy: Double ,
 oppositeX: Double ,
 oppositeY: Double ,
 tx: Double ,
 ty: Double ):GeneralPath
/**
 * Creates a round self loop path.
 * @param [sx] The x coordinate of the source port.
 * @param [sy] The y coordinate of the source port.
 * @param [oppositeX] The x coordinate of the single control point.
 * @param [oppositeY] The y coordinate of the single control point.
 * @param [tx] The x coordinate of the target port.
 * @param [ty] The y coordinate of the target port.
 * @return A path that describes a round self loop.
 * @see [createSelfLoopPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathBasedEdgeStyleRenderer%23PathBasedEdgeStyleRenderer-method-createRoundSelfLoop">Online Documentation</a>
 */
 final protected   fun createRoundSelfLoop( sx: Double ,
 sy: Double ,
 oppositeX: Double ,
 oppositeY: Double ,
 tx: Double ,
 ty: Double ):GeneralPath
}
}
