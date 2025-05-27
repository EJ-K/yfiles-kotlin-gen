// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Support class to describe hit test results in the context of [TableEditorInputMode] interactions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableHitTestResult">Online Documentation</a>
 */
external open class TableHitTestResult  : YObject {

/**
 * The item that is actually hit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableHitTestResult%23item">Online Documentation</a>
 */
final val item: IModelItem
/**
 * Specific information about the region on a stripe where the hit was detected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableHitTestResult%23region">Online Documentation</a>
 */
final val region: StripeSubregion?
/**
 * The node where [item] is directly or indirectly bound to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableHitTestResult%23tableNode">Online Documentation</a>
 */
final val tableNode: INode?

companion object : ClassMetadata<TableHitTestResult> {
}
}
