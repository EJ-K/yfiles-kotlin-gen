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
import yfiles.lang.ClassMetadata
import yfiles.layout.IEdgeLabelLayout
import yfiles.layout.INodeLabelLayout
import yfiles.layout.LayoutGraph

/**
 * This class represents the result of a layout run of [MultiPageLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult">Online Documentation</a>
 */
external open class MultiPageLayoutResult  : IElementInfoManager {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult%23MultiPageLayoutResult-method-getEdgeInfo">Online Documentation</a>
 */
 override   fun getEdgeInfo( edge: Edge ):IEdgeInfo?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult%23MultiPageLayoutResult-method-getEdgeLabelInfo">Online Documentation</a>
 */
 override   fun getEdgeLabelInfo( edgeLabelLayout: IEdgeLabelLayout ):IEdgeLabelInfo?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult%23MultiPageLayoutResult-method-getNodeInfo">Online Documentation</a>
 */
 override   fun getNodeInfo( node: Node ):INodeInfo?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult%23MultiPageLayoutResult-method-getNodeLabelInfo">Online Documentation</a>
 */
 override   fun getNodeLabelInfo( nodeLabelLayout: INodeLabelLayout ):INodeLabelInfo?
/**
 * Returns the page graph associated with the given page number.
 * @param [pageNo] the given page number (with `0` being the first page)
 * @return the page graph associated with the given page number
 * @throws IndexOutOfRangeError if `pageNo >= pageCount` or `pageNo < 0`
 * @see [pageCount]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult%23MultiPageLayoutResult-method-getPage">Online Documentation</a>
 */
 open   fun getPage( pageNo: Int ):LayoutGraph
/**
 * Returns the number of pages available in this [MultiPageLayoutResult].
 * @return the number of available pages
 * @see [getPage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult%23MultiPageLayoutResult-method-pageCount">Online Documentation</a>
 */
 open   fun pageCount():Int

companion object : ClassMetadata<MultiPageLayoutResult> {
}
}
