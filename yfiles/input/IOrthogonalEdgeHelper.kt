// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IGraph
import yfiles.lang.InterfaceMetadata

/**
 * An interface which provides methods that handle orthogonal editing of individual edges and can be decorated to the [ILookup][yfiles.collections.ILookup] of [IEdge][yfiles.graph.IEdge]s.
 * @see [OrthogonalEdgeEditingContext.orthogonalEdgeHelperProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrthogonalEdgeHelper">Online Documentation</a>
 */
external interface IOrthogonalEdgeHelper  {
  /**
   * Invoked after the edge this helper was provided for has been edited orthogonally.
   * @param [context] The input mode context which edited the edge.
   * @param [graph] The graph to use for modifying the edge instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrthogonalEdgeHelper%23IOrthogonalEdgeHelper-method-cleanUpEdge">Online Documentation</a>
   */
  fun cleanUpEdge(
    context: IInputModeContext,
    graph: IGraph,
  )
  
  /**
   * Gets the declared orientation of the given segment at the edge this helper was provided for.
   * @param [context] The input mode context for which the orientation is needed.
   * @param [segmentIndex] The index of the segment.
   * @return The declared orientation of the segment.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrthogonalEdgeHelper%23IOrthogonalEdgeHelper-method-getSegmentOrientation">Online Documentation</a>
   */
  fun getSegmentOrientation(
    context: IInputModeContext,
    segmentIndex: Int,
  ): SegmentOrientation
  
  /**
   * Determines whether the edge this helper was provided for should be edited orthogonally in the specified input mode context.
   * @param [context] The input mode context in which the edge is about to be edited.
   * @return `true` if the edge should be orthogonally edited in the specified input mode context; `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrthogonalEdgeHelper%23IOrthogonalEdgeHelper-method-shouldEditOrthogonally">Online Documentation</a>
   */
  fun shouldEditOrthogonally(
    context: IInputModeContext,
  ): Boolean
  
  /**
   * Determines whether this end of the edge this helper was provided for can be moved in the input mode context.
   * @param [context] The input mode context in which the segment is edited.
   * @param [sourceEnd] if set to `true` the source end of the edge is queried, otherwise the target end.
   * @return `true` if the end of the edge can be moved for the specified input mode context; `false` otherwise, in which case the corresponding segment needs to be split to keep the segment orientation orthogonal.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrthogonalEdgeHelper%23IOrthogonalEdgeHelper-method-shouldMoveEndImplicitly">Online Documentation</a>
   */
  fun shouldMoveEndImplicitly(
    context: IInputModeContext,
    sourceEnd: Boolean,
  ): Boolean

  
  companion object : InterfaceMetadata<IOrthogonalEdgeHelper> {
  }
}
