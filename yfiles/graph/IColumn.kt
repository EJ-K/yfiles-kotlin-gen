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
 * Interface that describes a column in a [ITable] instance.
 * @see [ITable.createChildColumn]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IColumn">Online Documentation</a>
 */
external interface IColumn : IStripe {
/**
 * Gets the child columns.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IColumn%23childColumns">Online Documentation</a>
 */
val childColumns: IEnumerable<IColumn>
/**
 * Gets the parent of this column.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IColumn%23parentColumn">Online Documentation</a>
 */
val parentColumn: IColumn?

companion object : InterfaceMetadata<IColumn> {
}
}
