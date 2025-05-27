// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IList
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface is implemented by classes that require to be notified of changes in [IPartition]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDecompositionListener">Online Documentation</a>
 */
external interface IDecompositionListener : YObject {
/**
 * Callback after the new given [PartitionCell] has been created.
 * @param [createdCell] the newly created [PartitionCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDecompositionListener%23IDecompositionListener-method-onCellCreated">Online Documentation</a>
 */
   fun onCellCreated( createdCell: PartitionCell )
/**
 * Callback after the given [PartitionCell] has been finalized.
 * @param [finalizedCell] the cell that has been finalized
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDecompositionListener%23IDecompositionListener-method-onCellFinalized">Online Documentation</a>
 */
   fun onCellFinalized( finalizedCell: PartitionCell )
/**
 * Callback after the given [PartitionCell] has been subdivided into several sub-cells.
 * @param [cell] the cell that has been subdivided
 * @param [subCells] the sub-cells resulting from the subdivision of the given [PartitionCell]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDecompositionListener%23IDecompositionListener-method-onCellSubdivided">Online Documentation</a>
 */
   fun onCellSubdivided( cell: PartitionCell ,
 subCells: IList<out PartitionCell> )
/**
 * Callback after the given [PartitionCell] has been unlocked.
 * @param [unlockedCell] the cell that has been unlocked
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDecompositionListener%23IDecompositionListener-method-onCellUnlocked">Online Documentation</a>
 */
   fun onCellUnlocked( unlockedCell: PartitionCell )

companion object : InterfaceMetadata<IDecompositionListener> {
}
}
