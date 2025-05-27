// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.lang.InterfaceMetadata

/**
 * Interface that describes a row in a [ITable] instance.
 * @see [ITable.createChildRow]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRow">Online Documentation</a>
 */
external interface IRow : IStripe {
/**
 * Gets the child rows.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRow%23childRows">Online Documentation</a>
 */
val childRows: IEnumerable<IRow>
/**
 * Gets the parent of this row.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IRow%23parentRow">Online Documentation</a>
 */
val parentRow: IRow?

companion object : InterfaceMetadata<IRow> {
}
}
