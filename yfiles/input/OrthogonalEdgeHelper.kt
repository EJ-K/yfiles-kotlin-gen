// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata

/**
 * Default implementation of the [IOrthogonalEdgeHelper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeHelper">Online Documentation</a>
 */
external open class OrthogonalEdgeHelper  : IOrthogonalEdgeHelper {

/**
 * Returns whether the given bend can be removed.
 * @param [context] The input mode context.
 * @param [bend] The bend that is designated for removal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeHelper%23OrthogonalEdgeHelper-method-canRemoveBend">Online Documentation</a>
 */
 open protected   fun canRemoveBend( context: IInputModeContext ,
 bend: IBend ):Boolean
/**
 * Invoked after the provided edge has been edited orthogonally.
 * 
 * The default implementation in this class removes duplicate and collinear bends, as well as segments of zero length.
 * @param [context] The input mode context which edited the edge.
 * @param [graph] The graph to use for modifying the edge instance.
 * @param [edge] The edge to clean up the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeHelper%23OrthogonalEdgeHelper-method-cleanUpEdge">Online Documentation</a>
 */
 override   fun cleanUpEdge( context: IInputModeContext ,
 graph: IGraph ,
 edge: IEdge )
/**
 * Gets the orientation of the given segment by looking at the geometry of the segment.
 * @param [context] The input mode context in which the orientation is needed.
 * @param [edge] The edge to inspect.
 * @param [segmentIndex] The index of the segment.
 * @return The declared orientation of the segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeHelper%23OrthogonalEdgeHelper-method-getSegmentOrientation">Online Documentation</a>
 */
 override   fun getSegmentOrientation( context: IInputModeContext ,
 edge: IEdge ,
 segmentIndex: Int ):SegmentOrientation
/**
 * Determines whether the provided edge should be edited orthogonally in the specified input mode context.
 * @param [context] The input mode context in which the edge is about to be edited.
 * @param [edge] The edge to inspect.
 * @return `true` if the edge should be orthogonally edited in the specified input mode context; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeHelper%23OrthogonalEdgeHelper-method-shouldEditOrthogonally">Online Documentation</a>
 */
 override   fun shouldEditOrthogonally( context: IInputModeContext ,
 edge: IEdge ):Boolean
/**
 * Determines whether this end of the provided edge can be moved in the input mode context.
 * @param [context] The input mode context in which the segment is edited.
 * @param [edge] The edge to inspect.
 * @param [sourceEnd] if set to `true` the source end of the edge is queried, otherwise the target end.
 * @return `true` if the end of the edge can be moved for the specified input mode context; `false` otherwise, in which case the corresponding segment needs to be split to keep the segment orientation orthogonal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalEdgeHelper%23OrthogonalEdgeHelper-method-shouldMoveEndImplicitly">Online Documentation</a>
 */
 override   fun shouldMoveEndImplicitly( context: IInputModeContext ,
 edge: IEdge ,
 sourceEnd: Boolean ):Boolean

companion object : ClassMetadata<OrthogonalEdgeHelper> {
}
}
