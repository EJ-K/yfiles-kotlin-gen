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
import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.lang.ClassMetadata

/**
 * The default implementation of the [IEdgePathCropper].
 * @see [IEdgePathCropper.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [DefaultEdgePathCropper].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-constructor-DefaultEdgePathCropper">Online Documentation</a>
 */
external open class DefaultEdgePathCropper  () : IEdgePathCropper {

/**
 * Gets the value that determines if the edge path is cropped at the port or at the node bounds.
 * 
 * The default is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23cropAtPort">Online Documentation</a>
 */
final var cropAtPort: Boolean
/**
 * Gets or sets an extra length the edge is cropped.
 * 
 * The default value is 0.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23extraCropLength">Online Documentation</a>
 */
final var extraCropLength: Double
/**
 * Calculates the total length the edge path is cropped.
 * @param [arrow] The arrow at this edge end.
 * @param [atSource] `true` if the crop length should be calculated at the edge source. `false` otherwise.
 * @return The total length the edge path is cropped.
 * @see [cropEdgePath]
 * @see [cropEdgePathAtArrow]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-calculateTotalCropLength">Online Documentation</a>
 */
 open protected   fun calculateTotalCropLength( arrow: IArrow? ,
 atSource: Boolean ):Double
/**
 * Crops the provided `path` at one end of an edge.
 * @param [edge] The edge whose path is to be cropped.
 * @param [atSource] Whether to crop the source or target side of the path.
 * @param [arrow] The arrow that is used at the end of the edge.
 * @param [path] The path to crop.
 * @return The cropped path. This is can be either the same instance of the given path or a newly created instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-cropEdgePath">Online Documentation</a>
 */
 override   fun cropEdgePath( edge: IEdge ,
 atSource: Boolean ,
 arrow: IArrow? ,
 path: GeneralPath ):GeneralPath
/**
 * Crops an edge's path at the source or target side with respect to the given arrow.
 * @param [atSource] if set to `true` the source side is cropped.
 * @param [arrow] The arrow to consider for the cropping.
 * @param [path] The edge's path to crop.
 * @return The cropped path. This is can be either the same instance of the given path or a newly created instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-cropEdgePathAtArrow">Online Documentation</a>
 */
 open   fun cropEdgePathAtArrow( atSource: Boolean ,
 arrow: IArrow? ,
 path: GeneralPath ):GeneralPath
/**
 * Crops an edge's path at the source or target side at the [port geometry][getPortGeometry] with respect to the given arrow.
 * @param [edge] The edge whose path is to be cropped.
 * @param [atSource] Whether to crop the source or target side of the path.
 * @param [arrow] The arrow that is used at the end of the edge.
 * @param [path] The path to crop.
 * @return The cropped path. This is can be either the same instance of the given path or a newly created instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-cropEdgePathAtPortGeometry">Online Documentation</a>
 */
 open protected   fun cropEdgePathAtPortGeometry( edge: IEdge ,
 atSource: Boolean ,
 arrow: IArrow? ,
 path: GeneralPath ):GeneralPath
/**
 * Finds the intersection between a node and the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-getIntersection">Online Documentation</a>
 */
 open protected   fun getIntersection( node: INode ,
 nodeShapeGeometry: IShapeGeometry? ,
 edge: IEdge ,
 inner: Point ,
 outer: Point ):Point?
/**
 * Returns the [geometry][IShapeGeometry] that is used to crop the edge at the node outline.
 * 
 * The default implementation queries the [node style renderer][INodeStyleRenderer.getShapeGeometry] for an implementation of [IShapeGeometry]. This method can be overridden to return an arbitrary [geometry][IShapeGeometry] for a node.
 * @param [node] The node the edge should be cropped at.
 * @return The [geometry][IShapeGeometry] of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-getNodeGeometry">Online Documentation</a>
 */
 open protected   fun getNodeGeometry( node: INode ):IShapeGeometry?
/**
 * Returns the [geometry][IShapeGeometry] that is used to crop the edge at the port outline if [cropAtPort] is set to `true`.
 * 
 * The default implementation returns `null`. This method can be overridden to return an arbitrary [geometry][IShapeGeometry] for a port.
 * @param [port] The port the edge should be cropped at.
 * @return The [geometry][IShapeGeometry] of the port.
 * @see [cropAtPort]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-getPortGeometry">Online Documentation</a>
 */
 open protected   fun getPortGeometry( port: IPort ):IShapeGeometry?
/**
 * Handles the edge path cropping if [cropEdgePath] would result in a [cleared][GeneralPath.clear] path.
 * @param [edge] The edge whose path is to be cropped.
 * @param [atSource] Whether to crop the source or target side of the path.
 * @param [arrow] The arrow that is used at the end of the edge.
 * @param [path] The path to crop.
 * @return The cropped path. This is can be either the same instance of the given path or a newly created instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-handleEmptyPath">Online Documentation</a>
 */
 open protected   fun handleEmptyPath( edge: IEdge ,
 atSource: Boolean ,
 arrow: IArrow? ,
 path: GeneralPath ):GeneralPath
/**
 * Checks whether a given point is inside a node's shape geometry with respect to the edge that is being calculated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultEdgePathCropper%23DefaultEdgePathCropper-method-isInside">Online Documentation</a>
 */
 open protected   fun isInside( location: Point ,
 node: INode ,
 nodeShapeGeometry: IShapeGeometry? ,
 edge: IEdge ):Boolean

companion object : ClassMetadata<DefaultEdgePathCropper> {
}
}

inline fun DefaultEdgePathCropper(
    block: DefaultEdgePathCropper.() -> Unit
): DefaultEdgePathCropper {
    return DefaultEdgePathCropper()
        .apply(block)
}
