// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.IEdgeLabelLayout
import yfiles.layout.INodeLabelLayout

/**
 * Interface that offers access to the information objects of graph elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementInfoManager">Online Documentation</a>
 */
external interface IElementInfoManager : YObject {
/**
 * Returns the edge information object of the given edge.
 * @param [edge] the edge for which the information object should be returned
 * @return the edge information object of the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementInfoManager%23IElementInfoManager-method-getEdgeInfo">Online Documentation</a>
 */
   fun getEdgeInfo( edge: Edge ):IEdgeInfo?
/**
 * Returns the edge label information object of the given edge label layout.
 * @param [edgeLabelLayout] the edge label layout for which the information object should be returned
 * @return the edge label information object of the given edge label layout
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementInfoManager%23IElementInfoManager-method-getEdgeLabelInfo">Online Documentation</a>
 */
   fun getEdgeLabelInfo( edgeLabelLayout: IEdgeLabelLayout ):IEdgeLabelInfo?
/**
 * Returns the node information object of the given node.
 * @param [node] the node for which the information object should be returned
 * @return the node information object of the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementInfoManager%23IElementInfoManager-method-getNodeInfo">Online Documentation</a>
 */
   fun getNodeInfo( node: Node ):INodeInfo?
/**
 * Returns the node label layout information object of the given node label layout.
 * @param [nodeLabelLayout] the node label layout for which the information object should be returned
 * @return the node label information object of the given node label layout
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementInfoManager%23IElementInfoManager-method-getNodeLabelInfo">Online Documentation</a>
 */
   fun getNodeLabelInfo( nodeLabelLayout: INodeLabelLayout ):INodeLabelInfo?

companion object : InterfaceMetadata<IElementInfoManager> {
}
}
