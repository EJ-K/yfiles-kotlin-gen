// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IColumn
import yfiles.graph.IRow
import yfiles.graph.IStripe
import yfiles.lang.InterfaceMetadata

/**
 * Manages the selection state of items in an [ITable][yfiles.graph.ITable] instance.
 * @see [ISelectionModel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeSelection">Online Documentation</a>
 */
external interface IStripeSelection : ISelectionModel<IStripe> {
/**
 * Gets or sets whether to allow the selection to span multiple table instances
 * 
 * The default is `false`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeSelection%23allowCrossTableSelection">Online Documentation</a>
 */
var allowCrossTableSelection: Boolean
/**
 * Gets or sets whether to allow mixed row/column selections
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeSelection%23allowMixedSelection">Online Documentation</a>
 */
var allowMixedSelection: Boolean
/**
 * Gets an [ISelectionModel] of the selected columns.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeSelection%23selectedColumns">Online Documentation</a>
 */
val selectedColumns: ISelectionModel<IColumn>
/**
 * Gets an [ISelectionModel] of the selected rows.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeSelection%23selectedRows">Online Documentation</a>
 */
val selectedRows: ISelectionModel<IRow>

companion object : InterfaceMetadata<IStripeSelection> {
}
}
