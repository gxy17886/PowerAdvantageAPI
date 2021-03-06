package cofh.api.energy;

import net.minecraft.util.EnumFacing;


/**
 * Implement this interface on Tile Entities which should receive energy, generally storing it in one or more internal IEnergyStorage objects.
 * <p>
 *
 * @author King Lemming
 *
 */
public interface IEnergyReceiver extends IEnergyConnection {

	/**
	 * Add energy to an IEnergyReceiver, internal distribution is left entirely to the IEnergyReceiver.
	 *
	 * @param facing
	 *            Orientation the energy is received from.
	 * @param maxReceive
	 *            Maximum amount of energy to receive.
	 * @param simulate
	 *            If TRUE, the charge will only be simulated.
	 * @return Amount of energy that was (or would have been, if simulated) received.
	 */
	int receiveEnergy(EnumFacing facing, int maxReceive, boolean simulate);

	/**
	 * Returns the amount of energy currently stored.
	 * @param facing
	 *            Orientation the energy is received from.
	 * @return amount stored
	 */
	int getEnergyStored(EnumFacing facing);

	/**
	 * Returns the maximum amount of energy that can be stored.
	 * @param facing
	 *            Orientation the energy is received from.
	 * @return amount that can be stored
	 */
	int getMaxEnergyStored(EnumFacing facing);

}
