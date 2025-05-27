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
 * This interface provides additional intervals in order to move from one [partition cell][PartitionCell] into an adjacent one.
 * @see [PartitionCell]
 * @see [PathSearch.addAdditionalEnterIntervalCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnterIntervalCalculator">Online Documentation</a>
 */
external interface IEnterIntervalCalculator : YObject {
/**
 * Appends additional enter intervals to the given list of enter intervals for moving from the [partition cell][PartitionCell] of the current [CellEntrance] to the neighboring cell.
 * @param [currentEntrance] the current [CellEntrance] that is exited
 * @param [enteredCell] the neighboring cell that will be entered
 * @param [commonInterval] the common interval of the left and entered partition cells
 * @param [allEnterIntervals] the list to which additional enter intervals have to be appended
 * @param [context] the context of the path search
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnterIntervalCalculator%23IEnterIntervalCalculator-method-appendEnterIntervals">Online Documentation</a>
 */
   fun appendEnterIntervals( currentEntrance: CellEntrance ,
 enteredCell: PartitionCell ,
 commonInterval: OrthogonalInterval ,
 allEnterIntervals: IList<out OrthogonalInterval> ,
 context: PathSearchContext )

companion object : InterfaceMetadata<IEnterIntervalCalculator> {
}
}
