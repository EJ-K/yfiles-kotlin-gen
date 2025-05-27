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
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Tangent
import yfiles.graph.IEdge
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.ICanvasContext
import yfiles.view.IRenderContext
import yfiles.view.Visual

/**
 * An abstract base class that makes it possible to easily implement a custom [IEdgeStyle].
 * @param [TVisual] The optional type of the [Visual] created and updated by the [createVisual] and [updateVisual] methods. This type argument can be omit, but specifying a more concrete type helps conveniently implementing [updateVisual] with TypeScript.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [EdgeStyleBase] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-constructor-EdgeStyleBase">Online Documentation</a>
 */
external abstract class EdgeStyleBase<TVisual : Visual> 
protected constructor () : IEdgeStyle {

/**
 * Gets the renderer implementation for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23renderer">Online Documentation</a>
 */
final override val renderer: IEdgeStyleRenderer
/**
 * Adds the arrows to a given container.
 * @param [context] The context for the rendering.
 * @param [group] The container to which the arrows should be added.
 * @param [edge] The edge that is being rendered.
 * @param [edgePath] The edge path.
 * @param [sourceArrow] The source arrow.
 * @param [targetArrow] The target arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-addArrows">Online Documentation</a>
 */
 open protected   fun addArrows( context: IRenderContext ,
 group: SVGGElement ,
 edge: IEdge ,
 edgePath: GeneralPath ,
 sourceArrow: IArrow ,
 targetArrow: IArrow )
/**
 * Creates a new object that is a copy of the current instance.
 * @return A new object that is a copy of this instance using [YObject.memberwiseClone].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-clone">Online Documentation</a>
 */
 override   fun clone():EdgeStyleBase<TVisual>
/**
 * Creates the visual.
 * @param [context] The render context.
 * @param [edge] The edge to which this style instance is assigned.
 * @return The visual as required by the [IVisualCreator.createVisual][yfiles.view.IVisualCreator.createVisual] interface.
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-createVisual">Online Documentation</a>
 */
 abstract protected   fun createVisual( context: IRenderContext ,
 edge: IEdge ):TVisual?
/**
 * Crops the edge's path at the nodes.
 * @param [edge] The edge that is being rendered.
 * @param [sourceArrow] The source arrow instance.
 * @param [targetArrow] The target arrow instance.
 * @param [path] The path that should be cropped.
 * @return The cropped path. This is can be either the same instance of the given path or a newly created instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-cropPath">Online Documentation</a>
 */
 open protected   fun cropPath( edge: IEdge ,
 sourceArrow: IArrow ,
 targetArrow: IArrow ,
 path: GeneralPath ):GeneralPath?
/**
 * Gets the bounds of the visual for the edge in the given context.
 * @param [context] The canvas context.
 * @param [edge] The edge to which this style instance is assigned.
 * @return The visual bounds of the visual representation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-getBounds">Online Documentation</a>
 */
 open protected   fun getBounds( context: ICanvasContext ,
 edge: IEdge ):Rect
/**
 * Gets the path of the edge.
 * @param [edge] The edge.
 * @return The path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-getPath">Online Documentation</a>
 */
 open protected   fun getPath( edge: IEdge ):GeneralPath?
/**
 * Gets the number of segments of the edge.
 * @param [edge] The edge.
 * @return The segment count.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-getSegmentCount">Online Documentation</a>
 */
 open protected   fun getSegmentCount( edge: IEdge ):Int
/**
 * Calculates the source arrow anchor and direction for a a given arrow and path.
 * @param [path] The path of the edge.
 * @param [arrow] The arrow.
 * @return The anchor and directional vector of the arrow, if any exist.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-getSourceArrowAnchor">Online Documentation</a>
 */
 open protected   fun getSourceArrowAnchor( path: GeneralPath ,
 arrow: IArrow ):Tangent?
/**
 * Gets the tangent to the edge at the specified ratio and the corresponding touch point.
 * @param [edge] The edge.
 * @param [ratio] A value between 0 and 1 inclusively that indicates a ratio from the beginning to the end of the path of the edge.
 * @return The tangent, if any exists.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-getTangent">Online Documentation</a>
 */
 open protected   fun getTangent( edge: IEdge ,
 ratio: Double ):Tangent?
/**
 * Gets the tangent to the edge at the specified ratio of a segment of the edge and the corresponding touch point.
 * @param [edge] The edge.
 * @param [segmentIndex] Index of the segment of the edge.
 * @param [ratio] A value between 0 and 1 inclusively that indicates a ratio from the beginning to the end of the segment of the edge.
 * @return The tangent, if any exists.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-getTangentForSegment">Online Documentation</a>
 */
 open protected   fun getTangentForSegment( edge: IEdge ,
 segmentIndex: Int ,
 ratio: Double ):Tangent?
/**
 * Calculates the target arrow anchor and direction for a a given arrow and path.
 * @param [path] The path of the edge.
 * @param [arrow] The arrow.
 * @return The anchor and directional vector of the arrow, if any exist.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-getTargetArrowAnchor">Online Documentation</a>
 */
 open protected   fun getTargetArrowAnchor( path: GeneralPath ,
 arrow: IArrow ):Tangent?
/**
 * Determines whether the visual representation of the edge has been hit at the given location.
 * @param [context] The input mode context.
 * @param [location] The point to test.
 * @param [edge] The edge to which this style instance is assigned.
 * @return `true` if the specified edge representation is hit; `false` otherwise.
 * @see [Point.hitsPolyline]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-isHit">Online Documentation</a>
 */
 open protected   fun isHit( context: IInputModeContext ,
 location: Point ,
 edge: IEdge ):Boolean
/**
 * Determines whether the visualization for the specified edge is included in the marquee selection.
 * @param [context] The input mode context.
 * @param [rectangle] The marquee selection box.
 * @param [edge] The edge to which this style instance is assigned.
 * @return `true` if the specified edge is visible is selected by the marquee rectangle; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-isInBox">Online Documentation</a>
 */
 open protected   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ,
 edge: IEdge ):Boolean
/**
 * Determines whether the visualization for the specified edge is included in the lasso selection.
 * @param [context] The input mode context.
 * @param [path] The lasso selection path.
 * @param [edge] The edge to which this style instance is assigned.
 * @return `true` if the specified edge is visible is selected by the lasso path; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-isInPath">Online Documentation</a>
 */
 open protected   fun isInPath( context: IInputModeContext ,
 path: GeneralPath ,
 edge: IEdge ):Boolean
/**
 * Determines whether the visualization for the specified edge is visible in the context.
 * @param [context] The canvas context.
 * @param [rectangle] The clipping rectangle.
 * @param [edge] The edge to which this style instance is assigned.
 * @return `true` if the specified edge is visible in the clipping rectangle; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-isVisible">Online Documentation</a>
 */
 open protected   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ,
 edge: IEdge ):Boolean
/**
 * Performs the [ILookup.lookup][yfiles.graph.ILookup.lookup] operation for the [IEdgeStyleRenderer.getContext] that has been queried from the [renderer].
 * @param [edge] The edge to use for the context lookup.
 * @param [type] The type to query.
 * @return An implementation of the `type` or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-lookup">Online Documentation</a>
 */
 open protected   fun <T : YObject>lookup( edge: IEdge ,
 type: YClass<T> ):T?
/**
 * Updates the arrows in a given container.
 * @param [context] The context for the rendering.
 * @param [group] The container to which the arrows should be added.
 * @param [edge] The edge that is being rendered.
 * @param [edgePath] The edge path.
 * @param [sourceArrow] The source arrow.
 * @param [targetArrow] The target arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-updateArrows">Online Documentation</a>
 */
 open protected   fun updateArrows( context: IRenderContext ,
 group: SVGGElement ,
 edge: IEdge ,
 edgePath: GeneralPath ,
 sourceArrow: IArrow ,
 targetArrow: IArrow )
/**
 * Updates the visual previously created by [createVisual].
 * @param [context] The render context.
 * @param [oldVisual] The visual that has been created in the call to [createVisual].
 * @param [edge] The edge to which this style instance is assigned.
 * @return The visual as required by the [IVisualCreator.createVisual][yfiles.view.IVisualCreator.createVisual] interface.
 * @see [createVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleBase%23EdgeStyleBase-method-updateVisual">Online Documentation</a>
 */
 open protected   fun updateVisual( context: IRenderContext ,
 oldVisual: TVisual ,
 edge: IEdge ):TVisual?

companion object : ClassMetadata<EdgeStyleBase<*>> {
}
}
