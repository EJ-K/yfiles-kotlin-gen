// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IRectangle
import yfiles.geometry.Rect
import yfiles.graph.INode
import yfiles.graph.ITable
import yfiles.lang.ClassMetadata

/**
 * [IReshapeHandler] implementation that constrains node resizes so that minimum size constraints of an associated [ITable] are satisfied and which resizes the outer [IStripe][yfiles.graph.IStripe]s of such a table when the node is resized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this Handler which wraps an existing instance of `coreHandler` and uses `table` for additional constraints.
 * @param [coreHandler] The handler that is wrapped by this instance.
 * @param [tableNode] The node for which this handler is used
 * @param [table] The table that is used for additional constraints.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23TableReshapeHandler-constructor-TableReshapeHandler">Online Documentation</a>
 * 
 * @property coreHandler
 * Gets the core reshape handler wrapped by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23coreHandler">Online Documentation</a>
 * 
 * @property tableNode
 * Gets the node this handler is used for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23tableNode">Online Documentation</a>
 * 
 * @property table
 * Gets the table used for additional constraints.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23table">Online Documentation</a>
 */
external open class TableReshapeHandler  (
final val coreHandler: IReshapeHandler,
final val tableNode: INode,
final val table: ITable) : IReshapeHandler {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23bounds">Online Documentation</a>
 */
final override val bounds: IRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23TableReshapeHandler-method-cancelReshape">Online Documentation</a>
 */
 final override   fun cancelReshape( context: IInputModeContext ,
 originalBounds: Rect )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23TableReshapeHandler-method-handleReshape">Online Documentation</a>
 */
 final override   fun handleReshape( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23TableReshapeHandler-method-initializeReshape">Online Documentation</a>
 */
 final override   fun initializeReshape( context: IInputModeContext )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableReshapeHandler%23TableReshapeHandler-method-reshapeFinished">Online Documentation</a>
 */
 final override   fun reshapeFinished( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect )

companion object : ClassMetadata<TableReshapeHandler> {
}
}
