// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

/**
 * This class provides algorithms for the triangulation of point sets in the plane.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TriangulationAlgorithm">Online Documentation</a>
 */
@JsName("TriangulationAlgorithm")
external object Triangulator {
/**
 * Computes a Delauney triangulation of the given points.
 * @receiver a graph whose nodes represent the points that need to be triangulated.
 * @param [pointData] must provide the location (YPoint) for each node in the given graph.
 * @param [revMap] a node map that will contain for each edge its reverse edge. If this argument is `null` then no reverse edge information will be available.
 * @return an edge on the outer face of the result graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TriangulationAlgorithm%23Triangulator-method-calcDelauneyTriangulation">Online Documentation</a>
 */
 final   fun Graph.calcDelauneyTriangulation( pointData: IDataProvider<Node, YPoint> ,
 revMap: IEdgeMap<Edge>? ):Edge?
/**
 * Computes a triangulation of the given points.
 * @receiver a graph whose nodes represent the points that need to be triangulated.
 * @param [pointData] must provide the location (YPoint) for each node in the given graph.
 * @param [reverseEdgeMap] a node map that will contain for each edge its reverse edge. If this argument is `null` then no reverse edge information will be available.
 * @return an edge on the outer face of the result graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TriangulationAlgorithm%23Triangulator-method-triangulatePoints(Graph,IDataProvider,IEdgeMap)">Online Documentation</a>
 */
 final   fun Graph.triangulatePoints( pointData: IDataProvider<Node, YPoint> ,
 reverseEdgeMap: IEdgeMap<Edge>? ):Edge?
/**
 * Computes a triangulation of the given points.
 * @param [points] the point set to be triangulated. The points must be provided as a YList of YPoints.
 * @param [result] the resulting triangulation
 * @param [resultMap] the node map that forms the link between a point and a node.
 * @param [reverseEdgeMap] a node map that will contain for each edge its reverse edge. If this argument is `null` then no reverse edge information will be available.
 * @return an edge on the outer face of the result graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TriangulationAlgorithm%23Triangulator-method-triangulatePoints(YList,Graph,INodeMap,IEdgeMap)">Online Documentation</a>
 */
 final   fun triangulatePoints( points: YList<YPoint> ,
 result: Graph ,
 resultMap: INodeMap<YPoint> ,
 reverseEdgeMap: IEdgeMap<Edge>? ):Edge?
}
